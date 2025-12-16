import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class NoteHttpServer {
    private static final int PORT = 8080;
    private static final List<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Note HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(
                             new OutputStreamWriter(clientSocket.getOutputStream(), StandardCharsets.UTF_8),
                             true);
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(clientSocket.getInputStream(),
                             StandardCharsets.UTF_8))
                ) {
                    String inputLine;
                    StringBuilder request = new StringBuilder();
                    int contentLength = 0;
                    while ((inputLine = in.readLine()) != null && !inputLine.isEmpty()) {
                        request.append(inputLine).append("\n");

                        if (inputLine.startsWith("Content-Length:")) {
                            contentLength = Integer.parseInt(inputLine.split(":")[1].trim());
                        }
                    }

                    if (contentLength > 0) {
                        char[] body = new char[contentLength];
                        in.read(body, 0, contentLength);
                        request.append("\n").append(body);
                    }

                    String[] requestLines = request.toString().split("\n");
                    String method = requestLines[0].split(" ")[0];
                    String path = requestLines[0].split(" ")[1];
                    String response;

                    if (method.equals("GET") && path.equals("/notes")) {
                        response = "HTTP/1.1 200 OK\r\n" +
                                   "Content-Type: text/html; charset=UTF-8\r\n" +
                                   "\r\n" +
                                   "<html><body><h1>Notes</h1><ul>";
                        for (String note : notes) {
                            response += "<li>" + note + "</li>";
                        }
                        response += "</ul></body></html>";
                    } else if (method.equals("POST") && path.equals("/add")) {
                        String note = requestLines[requestLines.length - 1].trim();

                        System.out.println(note);
                        System.out.println(Arrays.toString(requestLines));
                        System.out.println(request);

                        if (!note.isEmpty()) {
                            notes.add(note);
                            response = "HTTP/1.1 200 OK\r\n" +
                                       "Content-Type: text/html; charset=UTF-8\r\n" +
                                       "\r\n" +
                                       "<html><body><h1>Note added</h1></body></html>";
                        } else {
                            response = "HTTP/1.1 400 Bad Request\r\n" +
                                       "Content-Type: text/html; charset=UTF-8\r\n" +
                                       "\r\n" +
                                       "<html><body><h1>Empty note</h1></body></html>";
                        }
                    } else if (method.equals("POST") && path.equals("/remove")) {
                        if (!notes.isEmpty()) {
                            notes.remove(notes.size() - 1);
                            response = "HTTP/1.1 200 OK\r\n" +
                                       "Content-Type: text/html; charset=UTF-8\r\n" +
                                       "\r\n" +
                                       "<html><body><h1>Last note removed</h1></body></html>";
                        } else {
                            response = "HTTP/1.1 400 Bad Request\r\n" +
                                       "Content-Type: text/html; charset=UTF-8\r\n" +
                                       "\r\n" +
                                       "<html><body><h1>No notes to remove</h1></body></html>";
                        }
                    } else {
                        response = "HTTP/1.1 404 Not Found\r\n" +
                                   "Content-Type: text/html; charset=UTF-8\r\n" +
                                   "\r\n" +
                                   "<html><body><h1>404 Not Found</h1></body></html>";
                    }
                    out.println(response);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

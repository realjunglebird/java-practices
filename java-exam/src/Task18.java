import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int playersAmount = scanner.nextInt();
        scanner.nextLine();

        DiceGame game = new DiceGame();

        for (int i = 0; i < playersAmount; i++) {
            game.addPlayer();
        }

        game.playGame();
    }
}

class DiceGame {
    private List<String> players;
    private Random random;

    public DiceGame() {
        players = new ArrayList<>();
        random = new Random();
    }

    public void addPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        players.add(scanner.nextLine());
    }

    public void playGame() {
        int maxScore = 0;
        String winner = "";

        for (String player : players) {
            int score = random.nextInt(13);
            System.out.println(player + " выбросил " + score);
            if (score > maxScore) {
                maxScore = score;
                winner = player;
            }
        }

        System.out.println("Победитель: " + winner + " с результатом " + maxScore);
    }
}
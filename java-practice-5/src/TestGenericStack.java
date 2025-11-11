import java.util.Scanner;

public class TestGenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStackInheritance<String> stack = new GenericStackInheritance<>();

        System.out.println("Введите 5 строк:");

        for (int i = 0; i < 5; ++i) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}

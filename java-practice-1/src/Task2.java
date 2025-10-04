import java.util.Scanner;
import java.math.*;

public class Task2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner input = new Scanner(System.in);

        System.out.println("Задача №2");
        System.out.print("Введите сумму юаней: ");
        int yuan = input.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan;

        String word = switch (yuan % 10) {
            case 1 -> " китайский юань";
            case 2, 3, 4 -> " китайских юаня";
            default -> " китайских юаней";
        };
        if ((yuan / 10) % 10 == 1) {word = " китайских юаней";} // для чисел-исключений с 11 по 19

        System.out.println(yuan + word + " в рублях: " + Math.ceil(roubles));
    }
}
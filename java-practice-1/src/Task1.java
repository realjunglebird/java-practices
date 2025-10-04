import java.util.Scanner;
import java.math.*;

public class Task1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner input = new Scanner(System.in);

        System.out.println("Задача №1");
        System.out.print("Введите сумму китайских юаней: ");
        int yuan = input.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan;

        System.out.println(yuan + " китайских юаней = " + Math.ceil(roubles) + " российских рублей");
    }
}
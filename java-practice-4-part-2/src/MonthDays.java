import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {
                "январь", "февраль", "март", "апрель",
                "май", "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        int[] dom = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        Scanner scanner = new Scanner(System.in);
        int month = 0;

        /* Ввод номера месяца */
        while (true) {
            System.out.print("Введите целое число от 1 до 12: ");
            try {
                month = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Введённое число не является целым.");
            }
        }

        try {
            if (month == 2) {
                int year = 0;
                while (true) {
                    System.out.print("Введите год: ");
                    try {
                        year = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        scanner.next();
                        System.out.println("Введённое число не является целым.");
                    }
                }
                boolean leap = isLeapYear(year);
                int days = leap ? 29 : 28;
                System.out.println(
                        months[month - 1] + " " +
                        days + "дней" +
                        (leap ? "(високосный год)" : "")
                );
            } else {
                System.out.println(
                        months[month - 1] + " " +
                        dom[month - 1] + " дней"
                );
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введено недопустимое число.");
        }

        scanner.close();
    }

    /** Проверка, является ли год високосным */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}

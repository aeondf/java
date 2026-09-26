import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int number = readInt(sc, "Введите номер месяца (1-12): ");

        try {
            String month = months[number - 1];
            int days = dom[number - 1];

            if (number == 2) {
                int year = readInt(sc, "Введите год: ");
                boolean leap = isLeapYear(year);
                if (leap) {
                    days = 29;
                }
                System.out.println("Месяц: " + month + " " + year + " года, количество дней: "
                        + days + (leap ? " (високосный год)" : " (невисокосный год)"));
            } else {
                System.out.println("Месяц: " + month + ", количество дней: " + days);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }

    // год високосный, если делится на 4 и не делится на 100, либо делится на 400
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // спрашивает число, пока пользователь не введёт целое
    static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: нужно ввести целое число");
                sc.next(); // пропускаем неверный ввод
            }
        }
    }
}

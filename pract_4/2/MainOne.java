import java.util.InputMismatchException;
import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int number = readInt(sc, "Введите номер месяца (1-12): ");

        try {
            System.out.println("Месяц: " + months[number - 1] + ", количество дней: " + dom[number - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
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

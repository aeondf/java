import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        int yuan = sc.nextInt();

        double roubles = yuan * ROUBLES_PER_YUAN;
        System.out.println("Сумма в рублях: " + roubles);
    }
}
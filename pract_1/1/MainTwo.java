import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        int yuan = sc.nextInt();

        double roubles = yuan * ROUBLES_PER_YUAN;

        int digit = yuan % 10;
        String ending;
        if (digit == 1) {
            ending = "юань";
        } else if (digit == 2 || digit == 3 || digit == 4) {
            ending = "юаня";
        } else {
            ending = "юаней";
        }

        System.out.println(yuan + " " + ending + " = " + roubles + " рублей");
    }
}
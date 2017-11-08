import java.util.Scanner;

public class K_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("USD = ");

        Double usd = Double.parseDouble(scanner.nextLine());

        System.out.printf("BGN = %.2f", usd * 1.79549);
    }
}

import java.util.Scanner;

public class L_CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double bgn = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("USD")) {
            bgn = bgn * 1.79549;
        }
        else if (input.equals("EUR")) {
            bgn = bgn * 1.95583;
        }
        else if (input.equals("GBP")) {
            bgn = bgn * 2.53405;
        }
        if (output.equals("USD")) {
            bgn = bgn / 1.79549;
        }
        else if (output.equals("EUR")) {
            bgn = bgn / 1.95583;
        }
        else if (output.equals("GBP")) {
            bgn = bgn / 2.53405;
        }

        System.out.printf("%.2f %s", bgn, output);
    }
}

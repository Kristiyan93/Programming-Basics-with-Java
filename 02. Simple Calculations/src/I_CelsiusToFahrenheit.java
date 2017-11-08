import java.util.Scanner;

public class I_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("°C = ");
        Double C = Double.parseDouble(scanner.nextLine());

        System.out.printf("°F = %f", (C*1.8) + 32);
    }
}

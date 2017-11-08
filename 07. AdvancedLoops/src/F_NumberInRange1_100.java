import java.util.Scanner;

public class F_NumberInRange1_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        while ( n < 1 || n > 100) {
            System.out.println("Invalid number!");

            n = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The number is: " + n);
    }
}

import java.util.Scanner;

public class C_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = Integer.parseInt(scanner.nextLine());

        boolean even = (num % 2 == 0);

        if (even) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

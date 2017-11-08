import java.util.Scanner;

public class B_NumbersN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

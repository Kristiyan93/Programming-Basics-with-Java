import java.util.Scanner;

public class A_Numbers1_NwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}

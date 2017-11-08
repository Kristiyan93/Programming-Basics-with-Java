import java.util.Scanner;

public class E_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(k);

            k = k * 2 + 1;

            if (k > n) {
                break;
            }
        }
    }
}

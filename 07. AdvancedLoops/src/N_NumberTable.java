import java.util.Scanner;

public class N_NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                int num = i + j + 1;

                if (n - i > j) {
                    System.out.print(num + " ");
                } else {
                    System.out.print(2 * n - num + " ");
                }
            }

            System.out.println();
        }
    }
}

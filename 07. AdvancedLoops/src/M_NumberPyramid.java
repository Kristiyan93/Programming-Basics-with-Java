import java.util.Scanner;

public class M_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
                num++;

                if (num > n) {
                    return;
                }
            }
            System.out.println();
        }
    }
}

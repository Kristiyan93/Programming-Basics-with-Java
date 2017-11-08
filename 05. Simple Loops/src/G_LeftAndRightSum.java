import java.util.Scanner;

public class G_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            left += num;
        }

        for (int i = 0; i < n; i++) {
            int num =Integer.parseInt(scanner.nextLine());
            right+=num;
        }

        int dif = Math.abs(right-left);

        if (dif != 0) {
            System.out.println("No Diff=" + dif);
        } else {
            System.out.println("Yes sum=" + right);
        }
    }
}

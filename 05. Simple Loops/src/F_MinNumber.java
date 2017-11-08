import java.util.Scanner;

public class F_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            Integer num = Integer.parseInt(scanner.nextLine());
            if (num < minNumber) {
                minNumber = num;
            }
        }

        System.out.println(minNumber);
    }
}

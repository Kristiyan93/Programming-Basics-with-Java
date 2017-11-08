import java.util.Scanner;

public class H_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(scanner.nextLine());
            } else {
                oddSum += Integer.parseInt(scanner.nextLine());
            }
        }

        Integer diff = Math.abs(evenSum - oddSum);

        if (diff != 0) {
            System.out.println("No Diff= "+ diff);
        }
        else if (diff == 0) {
            System.out.println("Yes Sum= " + evenSum);
        }
    }
}

import java.util.Scanner;

public class L_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        Integer maxDiff = 0;
        Integer lastSum = 0;

        for (int i = 0; i < n; i++) {
            Integer num1 = Integer.parseInt(scanner.nextLine());
            Integer num2 = Integer.parseInt(scanner.nextLine());
            Integer currentSum = num1 + num2;
            Integer currentDiff = Math.abs(currentSum - lastSum);

            if (i > 0 && maxDiff < currentDiff) {
                maxDiff = currentDiff;
            }

            lastSum = currentSum;
        }

        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d", lastSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}

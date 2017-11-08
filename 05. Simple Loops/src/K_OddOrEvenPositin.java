import java.text.DecimalFormat;
import java.util.Scanner;

public class K_OddOrEvenPositin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 1) {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            } else {
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            }
        }

        DecimalFormat format = new DecimalFormat("##.###########");

        System.out.printf("OddSum=%s, ", format.format(oddSum));
        System.out.printf("OddMin=%s, ", oddMin == Integer.MAX_VALUE ? "No" : format.format(oddMin));
        System.out.printf("OddMax=%s, ", oddMin == Integer.MAX_VALUE ? "No" : format.format(oddMax));

        System.out.printf("EvenSum=%s, ", format.format(evenSum));
        System.out.printf("EvenMin=%s, ", evenMin != Integer.MAX_VALUE ? format.format(evenMin) : "No");
        System.out.printf("EvenMax=%s", evenMin == Integer.MAX_VALUE ? "No" : format.format(evenMax));
    }
}

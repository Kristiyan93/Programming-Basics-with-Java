import java.util.Scanner;

public class E_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            Integer num =Integer.parseInt(scanner.nextLine());

            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        System.out.println(maxNumber);
    }
}

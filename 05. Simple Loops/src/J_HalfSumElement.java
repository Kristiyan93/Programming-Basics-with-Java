import java.util.Scanner;

public class J_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > max){
                max = num;
            }
            sum += num;
        }

        sum -= max;

        if (sum == max) {
            System.out.println("Yes sum= "+ max);
        } else {
            int dif = Math.abs(max - sum);
            System.out.println("No Diff= "+ dif);
        }
    }
}

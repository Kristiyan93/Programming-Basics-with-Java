import java.util.Scanner;

public class C_PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n =Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num = num * 2;
        }
    }
}

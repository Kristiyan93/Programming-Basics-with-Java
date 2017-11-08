import java.util.Scanner;

public class D_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int i = 0; i <= n; i+=2) {
            System.out.println(num);
            num = 2 * num * 2;
        }
    }
}

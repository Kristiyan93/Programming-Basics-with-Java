import java.util.Scanner;

public class O_3EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.nextLine());
        Integer b = Integer.parseInt(scanner.nextLine());
        Integer c = Integer.parseInt(scanner.nextLine());

        if (a == b && b == c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

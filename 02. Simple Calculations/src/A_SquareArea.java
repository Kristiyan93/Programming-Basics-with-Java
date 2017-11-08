import java.util.Scanner;

public class A_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.nextLine());
        Integer area = a * a;

        System.out.println(area);
    }
}

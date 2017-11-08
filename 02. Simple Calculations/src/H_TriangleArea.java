import java.util.Scanner;

public class H_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        Double a = Double.parseDouble(scanner.nextLine());

        System.out.print("h = ");
        Double h = Double.parseDouble(scanner.nextLine());

        System.out.printf("Triangle = %.2f", a * h / 2);
    }
}

import java.util.Scanner;

public class E_TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.nextLine());
        Double b = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        Double area = (a + b) * h/2;

        System.out.println("Trapezoid area=" + area);
    }
}

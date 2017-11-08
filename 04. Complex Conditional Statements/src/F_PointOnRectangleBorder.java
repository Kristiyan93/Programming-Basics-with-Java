import java.util.Scanner;

public class F_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());

        boolean isBorder = (x == x1 || x == x2) && (y >= y1 && y <= y2 ) ||
                (y == y1 || y == y2) && (x >= x1 && x < x2);

        if (isBorder) {
            System.out.println("border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}

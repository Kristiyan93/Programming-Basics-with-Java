import java.util.Scanner;

public class C_PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());

        boolean isInside = (x1 <= x && x <= x2) && (y1 <= y && y <= y2);

        if (isInside) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}

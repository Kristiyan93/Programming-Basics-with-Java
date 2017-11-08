import java.util.Scanner;

public class G_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());

        Double width = Math.max(x1,x2) - Math.min(x1,x2);
        Double height = Math.max(y1,y2) - Math.min(y1,y2);

        System.out.printf("Area = %f%n", width*height);
        System.out.printf("Perimeter = %f", (width+height)*2);
    }
}

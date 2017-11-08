import java.util.Scanner;

public class M_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer h = Integer.parseInt(scanner.nextLine());
        Integer x = Integer.parseInt(scanner.nextLine());
        Integer y = Integer.parseInt(scanner.nextLine());

        boolean first = (x > h && x < 2 * h && y >= h && y < 4 * h);
        boolean second = (x > 0 && x < 3 * h && y > 0 && y < h);
        boolean firstTop = (y == 4 * h && x >= h && x <= 2 * h);
        boolean firstLeft = (x == h && y >= h && y <= 4 * h);
        boolean firstRight = (x == 2 * h && y >= h && y <= 4 * h);
        boolean secondUpLeft = (y == h && x >= 0 && x <= h);
        boolean secondUpRight = (y == h && x >= 2 * h && x <= 3 * h);
        boolean secondLeft = (x == 0 && y >= 0 && y <= h);
        boolean secondRight = (x == 3 * h && y >= 0 && y <= h);
        boolean secondDown = (y == 0 && x >= 0 && x <= 3 * h);

        if (first || second) {
            System.out.println("inside");
        }
        else if (firstTop || firstLeft || firstRight ||
                secondUpLeft || secondUpRight || secondLeft ||
                secondRight || secondDown) {
            System.out.println("border");
        } else  {
            System.out.println("outside");
        }
    }
}

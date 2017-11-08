import java.util.Scanner;

public class J_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double rad = Double.parseDouble(scanner.nextLine());

        System.out.printf("Degrees = %f", rad * 180d / Math.PI);
    }
}

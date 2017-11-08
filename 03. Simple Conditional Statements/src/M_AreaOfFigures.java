import java.util.Scanner;

public class M_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figures = scanner.nextLine();

        if (figures.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());

            System.out.println(a * a);
        }
        else if (figures.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b  = Double.parseDouble(scanner.nextLine());

            System.out.println(a * b);
        }
        else if (figures.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());

            System.out.println(a * Math.PI * a);
        }
        else if (figures.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b  = Double.parseDouble(scanner.nextLine());

            System.out.println(a * b / 2);
        }
    }
}

import java.util.Scanner;

public class B_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inches:");

        Double inches = Double.parseDouble(scanner.nextLine());
        Double centimeters = inches * 2.54;

        System.out.println("Centimeters=" + centimeters);

    }
}

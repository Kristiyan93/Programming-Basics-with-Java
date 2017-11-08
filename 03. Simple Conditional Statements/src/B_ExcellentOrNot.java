import java.util.Scanner;

public class B_ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent.");
        }
    }
}

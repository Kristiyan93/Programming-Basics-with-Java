import java.util.Scanner;

public class A_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age < 16) {
            if (gender.equalsIgnoreCase("m")) {
                System.out.println("Master");
            }
            else if (gender.equalsIgnoreCase("f")) {
                System.out.println("Miss");
            }
        } else {
            if (gender.equalsIgnoreCase("m")) {
                System.out.println("Mr.");
            }
            else if (gender.equalsIgnoreCase("f")) {
                System.out.println("Ms.");
            }
        }
    }
}

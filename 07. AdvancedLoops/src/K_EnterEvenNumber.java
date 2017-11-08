import java.util.Scanner;

public class K_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        while (true){
            System.out.print("Enter even number: ");
            try {
                n = Integer.parseInt(scanner.nextLine());

                if (n % 2 != 0){
                    System.out.println("Invalid number!");

                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number! ");
            }
        }

        System.out.println("Even number entered: " + n);
    }
}

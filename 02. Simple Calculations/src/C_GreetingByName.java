import java.util.Scanner;

public class C_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.printf("Hello, %s!",name);
    }
}
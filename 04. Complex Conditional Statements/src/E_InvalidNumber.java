import java.util.Scanner;

public class E_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        boolean isInRange = (n >= 100 && n <= 200) || n ==0;

        if (!isInRange){
            System.out.println("invalid");
        }
    }
}

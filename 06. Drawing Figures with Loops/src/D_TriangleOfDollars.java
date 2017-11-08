import java.util.Scanner;

public class D_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(newString("$ ", i + 1).trim());
        }
    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i <repeatCount ; i++) {
            a += text;
        }

        return a;
    }
}
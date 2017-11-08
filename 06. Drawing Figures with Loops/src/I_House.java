import java.util.Scanner;

public class I_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int starCount = 1;
        int baseHeight = n / 2;
        int roofHeight = n - baseHeight;
        int dashesCount = n - starCount;

        if (n % 2 == 0) {
            starCount++;
        }

        for (int i = 0; i < roofHeight; i++) {
            System.out.print(repeatStr("-", dashesCount / 2));
            System.out.print(repeatStr("*", starCount));
            System.out.println(repeatStr("-", dashesCount / 2));

            starCount += 2;
            dashesCount -= 2;
        }

        for (int i = 0; i < baseHeight; i++) {
            System.out.printf("|%s|%n", repeatStr("*", n - 2));
        }
    }
    public static String repeatStr (String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}

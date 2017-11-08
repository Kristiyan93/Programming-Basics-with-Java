import java.util.Scanner;

public class F_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i));
            System.out.println(repeatStr("* ", i));
        }

        for (int i = n - 1; i > 0 ; i--) {
            System.out.print(repeatStr(" ", n - i));
            System.out.println(repeatStr("* ", i));
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
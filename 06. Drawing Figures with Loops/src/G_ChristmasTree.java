import java.util.Scanner;

public class G_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n + 1; i++) {
            System.out.println(repeatStr(" ", n -i) + repeatStr("*", i) + " | " +
                    repeatStr("*", i) + repeatStr(" ", n -i));
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

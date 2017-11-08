import java.util.Scanner;

public class H_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //top
        System.out.print(repeatStr("*", n * 2));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", n * 2));
        //middle
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*" + repeatStr("/", (n * 2) - 2) + "*");
            if ((n - 1) / 2 - 1 == i){
                System.out.print(repeatStr("|", n));
            }else {
                System.out.print(repeatStr(" ", n));
            }
            System.out.println("*" + repeatStr("/", (n * 2) - 2) + "*");
        }
        //bottom
        System.out.print(repeatStr("*", n * 2));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", n * 2));
    }
    public static String repeatStr (String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
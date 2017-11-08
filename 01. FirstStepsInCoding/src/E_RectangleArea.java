import java.util.Scanner;

public class E_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.nextLine());
        Integer b = Integer.parseInt(scanner.nextLine());

        Integer resultArea = a * b;

        System.out.println(resultArea);
    }
}

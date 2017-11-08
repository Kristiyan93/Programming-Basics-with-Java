import java.util.Scanner;

public class N_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer h = Integer.parseInt(scanner.nextLine());
        Integer min = Integer.parseInt(scanner.nextLine());

        min = min + 15;

        if (min > 59) {
            h++;
            min -= 60;
        }
        if (h > 23) {
            h = 0;
        }

        System.out.printf("%d:%02d", h, min);
    }
}

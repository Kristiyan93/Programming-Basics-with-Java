import java.util.Scanner;

public class L_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        Integer p = Integer.parseInt(scanner.nextLine());
        Integer h = Integer.parseInt(scanner.nextLine());

        int SofiaPlay = 48 - h;
        double gameSofia = (48 - h) * 3 / 4.0;
        double myCity = p * 2 / 3.0;
        double game = gameSofia + myCity + h;

        if (year.equalsIgnoreCase("leap")){
            game = 1.15 * game;
            System.out.println((int)(game));
        }
        else if (year.equalsIgnoreCase("normal")) {
            System.out.println((int)(game));
        }
    }
}

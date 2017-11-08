import java.util.Scanner;

public class F_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer score = Integer.parseInt(scanner.nextLine());
        Double bonus = 0d;

        if (score <= 100) {
            bonus = bonus + 5;
        }
        else if (score <= 1000) {
            bonus = bonus + (score * 20) / 100.0;
        }
        else {
            bonus = bonus + (score * 10) / 100.0;
        }
        if (score % 2 == 0) {
            bonus = bonus + 1;
        }
        else if (score % 5 == 0) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + score);
    }
}

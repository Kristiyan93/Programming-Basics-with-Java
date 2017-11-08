import java.util.Scanner;

public class G_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer sec1 = Integer.parseInt(scanner.nextLine());
        Integer sec2 = Integer.parseInt(scanner.nextLine());
        Integer sec3 = Integer.parseInt(scanner.nextLine());
        Integer secs = sec1 + sec2 + sec3;

        Integer mins = 0;

        if (secs > 119) {
            mins = 2;
            secs = secs - 120;
        }
        if (secs > 59) {
            mins++;
            secs = secs - 60;
        }
        if (secs < 10) {
            System.out.println(mins + ":" + "0" + secs);
        } else {
            System.out.println(mins + ":" + secs);
        }
    }
}

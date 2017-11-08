import java.util.Scanner;

public class I_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if (symbol=='a') {
                sum += 1;
            }
            else if (symbol=='e') {
                sum += 2;
            }
            else if (symbol=='i') {
                sum += 3;
            }
            else if (symbol=='o') {
                sum += 4;
            }
            else if (symbol=='u') {
                sum += 5;
            }
        }

        System.out.println(sum);
    }
}

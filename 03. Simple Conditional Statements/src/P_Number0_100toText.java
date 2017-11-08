import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P_Number0_100toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersTo20 = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen");
        List<String> numbersAfter20 = Arrays.asList("twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety", "one hundred");

        Integer number = Integer.parseInt(scanner.nextLine());

        String numberWord = "";

        if (number >= 0 && number <= 100) {
            if (number < 20) {
                numberWord = numbersTo20.get(number);
            } else {
                numberWord = numbersAfter20.get(((number / 10)) - 2);
                if (number % 10 != 0) {
                    numberWord = numberWord + " " + numbersTo20.get(number % 10);
                }
            }
        }

        if (!numberWord.equals("")){
            System.out.println(numberWord);
        } else {
            System.out.println("invalid number");
        }
    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class M_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        parsedDate = parsedDate.plusDays(999);

        System.out.println(parsedDate.format(formatter));
    }
}

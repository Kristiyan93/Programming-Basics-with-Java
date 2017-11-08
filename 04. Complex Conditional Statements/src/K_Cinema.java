import java.util.Scanner;

public class K_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projec = scanner.nextLine();
        Integer r = Integer.parseInt(scanner.nextLine());
        Integer c = Integer.parseInt(scanner.nextLine());

        Double result = 0d;

        if (projec.equalsIgnoreCase("Premiere")){
            result = (r * c) * 12.0;
        }
        else if (projec.equalsIgnoreCase("Normal")){
            result = (r * c) * 7.50;
        }
        else if (projec.equalsIgnoreCase("Discount")){
            result = (r * c) * 5.0;
        }

        System.out.printf("%.2f leva ", result);
    }
}

import java.util.Scanner;

public class G_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());

        Double price = 0d;

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") ||
                day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday")) {
            if (fruit.equalsIgnoreCase("banana")) {
                price = quantity * 2.50;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("apple")) {
                price = quantity * 1.20;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("orange")) {
                price = quantity * 0.85;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("grapefruit")) {
                price = quantity * 1.45;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("kiwi")) {
                price = quantity * 2.70;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("pineapple")) {
                price = quantity * 5.50;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("grapes")) {
                price = quantity * 3.85;
                System.out.println(price);
            }
        } else {
            System.out.println("error");
        }

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            if (fruit.equalsIgnoreCase("banana")) {
                price = quantity * 2.70;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("apple")) {
                price = quantity * 1.25;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("orange")) {
                price = quantity * 0.90;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("grapefruit")) {
                price = quantity * 1.60;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("kiwi")) {
                price = quantity * 3.00;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("pineapple")) {
                price = quantity * 5.60;
                System.out.println(price);
            }
            else if (fruit.equalsIgnoreCase("grapes")) {
                price = quantity * 4.20;
                System.out.println(price);
            }
        } else {
            System.out.println("error");
        }
    }
}

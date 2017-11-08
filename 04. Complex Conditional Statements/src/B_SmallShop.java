import java.util.Scanner;

public class B_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String  city = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());

        Double price = 0d;

        if (city.equalsIgnoreCase("Sofia")) {
            if (product.equalsIgnoreCase("coffee")) {
                price = quantity * 0.50;
            }
            else if (product.equalsIgnoreCase("water")) {
                price = quantity * 0.80;
            }
            else if (product.equalsIgnoreCase("beer")) {
                price = quantity * 1.20;
            }
            else if (product.equalsIgnoreCase("sweets")) {
                price = quantity * 1.45;
            }
            else if (product.equalsIgnoreCase("peanuts")) {
                price = quantity * 1.60;
            }
        }

        if (city.equalsIgnoreCase("Plovdiv")) {
            if (product.equalsIgnoreCase("coffee")) {
                price = quantity * 0.40;
            }
            else if (product.equalsIgnoreCase("water")) {
                price = quantity * 0.70;
            }
            else if (product.equalsIgnoreCase("beer")) {
                price = quantity * 1.15;
            }
            else if (product.equalsIgnoreCase("sweets")) {
                price = quantity * 1.30;
            }
            else if (product.equalsIgnoreCase("peanuts")) {
                price = quantity * 1.50;
            }
        }

        if (city.equalsIgnoreCase("Varna")){
            if (product.equalsIgnoreCase("coffee")) {
                price = quantity * 0.45;
            }
            else if (product.equalsIgnoreCase("water")) {
                price = quantity * 0.70;
            }
            else if (product.equalsIgnoreCase("beer")) {
                price = quantity * 1.10;
            }
            else if (product.equalsIgnoreCase("sweets")) {
                price = quantity * 1.35;
            }
            else if (product.equalsIgnoreCase("peanuts")) {
                price = quantity * 1.55;
            }
        }

        System.out.println(price);
    }
}

import java.util.Scanner;

public class H_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        Double sales = Double.parseDouble(scanner.nextLine());

        Double commission = 0.0;

        if (city.equalsIgnoreCase("Sofia")) {
            if (sales > 10000) {
                commission = 0.12 * sales;
            }
            else if (sales > 1000 && sales <= 10000) {
                commission = 0.08 * sales;
            }
            else if (sales > 500 && sales <= 1000) {
                commission = 0.07 * sales;
            }
            else if (sales >= 0 && sales <= 500) {
                commission = 0.05 * sales;
            }
        }else {
            System.out.println("error");
        }

        if (city.equalsIgnoreCase("Varna")) {
            if (sales > 10000){
                commission = 0.13 * sales;
            }
            else if (sales > 1000 && sales <= 10000) {
                commission = 0.10 * sales;
            }
            else if (sales > 500 && sales <= 1000) {
                commission = 0.075 * sales;
            }
            else if (sales >= 0 && sales <= 500) {
                commission = 0.045 * sales;
            }
        }else {
            System.out.println("error");
        }

        if (city.equalsIgnoreCase("Plovdiv")) {
            if (sales > 10000){
                commission = 0.145 * sales;
            }
            else if (sales > 1000 && sales <= 10000) {
                commission = 0.12 * sales;
            }
            else if (sales > 500 && sales <= 1000) {
                commission = 0.08 * sales;
            }
            else if (sales >= 0 && sales <= 500) {
                commission = 0.055 * sales;
            }
        }else {
            System.out.println("error");
        }

        System.out.printf("%.2f", commission);
    }
}

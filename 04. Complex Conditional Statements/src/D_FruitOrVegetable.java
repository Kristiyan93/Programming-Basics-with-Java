import java.util.Scanner;

public class D_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitorvegetable = scanner.nextLine();

        if (fruitorvegetable.equals("banana") || fruitorvegetable.equals("apple") ||
                fruitorvegetable.equals("kiwi") || fruitorvegetable.equals("cherry") ||
                fruitorvegetable.equals("lemon") || fruitorvegetable.equals("grapes")) {
            System.out.println("fruit");
        }
        else if (fruitorvegetable.equals("tomato") || fruitorvegetable.equals("cucumber") ||
                fruitorvegetable.equals("pepper") ||
                fruitorvegetable.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}

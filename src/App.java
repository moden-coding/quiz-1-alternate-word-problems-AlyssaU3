import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grocery budget:");
        int budget = Integer.valueOf(scanner.nextLine());
        while (true) {

            System.out.println("Enter the price of the item:");
            int price = Integer.valueOf(scanner.nextLine());

            if (budget < price) {
                System.out.println("You are over budget by $" + (-1 * (budget - price)) + ".");
                break;
            }
            if (price<0) {
                break;
            }
            int money = budget - price;
            System.out.println("You have $" + money + " remaining.");
            budget = money;
            
        }
    }
}

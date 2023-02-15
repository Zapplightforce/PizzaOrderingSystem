import java.util.Scanner;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create NY Style Pizza Factory
        PizzaFactory nyPizzaFactory = new NYStylePizzaFactory();

        // Create order and observers
        Order order = new Order();
        PizzaOrderObserver johnObserver = new PizzaOrderObserver("John");
        PizzaOrderObserver emilyObserver = new PizzaOrderObserver("Emily");
        order.registerObserver(johnObserver);
        order.registerObserver(emilyObserver);

        // Take user input for pizza order
        while (true) {
            System.out.println("Enter pizza type (cheese/pepperoni) or 'done' to exit: ");
            String pizzaType = scanner.next();
            if (pizzaType.equals("done")) {
                break;
            }
            Pizza pizza = nyPizzaFactory.createPizza(pizzaType);
            System.out.println("Would you like extra cheese? (y/n): ");
            String addCheese = scanner.next();
            if (addCheese.equals("y")) {
                pizza = new CheeseTopping(pizza);
            }
            System.out.println("Would you like pepperoni? (y/n): ");
            String addPepperoni = scanner.next();
            if (addPepperoni.equals("y")) {
                pizza = new PepperoniTopping(pizza);
            }
            order.addPizza(pizza);
        }

        // Remove observers
        order.removeObserver(johnObserver);
        order.removeObserver(emilyObserver);

        // Print final order
        System.out.println("Order complete! Total cost: $" + order.getTotalCost());
    }
}

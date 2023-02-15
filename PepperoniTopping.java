// Structural Design Pattern - Decorator
class PepperoniTopping extends PizzaTopping {
    Pizza pizza;

    public PepperoniTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", with pepperoni";
    }

    public double cost() {
        return pizza.cost() + 2.99;
    }
}
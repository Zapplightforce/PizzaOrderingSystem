// Structural Design Pattern - Decorator
class CheeseTopping extends PizzaTopping {
    Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", with extra cheese";
    }

    public double cost() {
        return pizza.cost() + 1.99;
    }
}
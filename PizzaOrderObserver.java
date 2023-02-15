// Behavioral Design Pattern - Observer
class PizzaOrderObserver implements Observer {
    private String name;

    public PizzaOrderObserver(String name) {
        this.name = name;
    }

    public void update(Order order) {
        System.out.println("[" + name + "] New pizza ordered! Total cost: $" + order.getTotalCost());
    }
}
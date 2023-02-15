import java.util.ArrayList;
import java.util.List;

// Behavioral Design Pattern - Observer
class Order implements Subject {
    List<Observer> observers;
    List<Pizza> pizzas;
    double totalCost;

    public Order() {
        observers = new ArrayList<>();
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        totalCost += pizza.cost();
        notifyObservers();
    }

    public void removePizza(Pizza pizza) {
        pizzas.remove(pizza);
        totalCost -= pizza.cost();
        notifyObservers();
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
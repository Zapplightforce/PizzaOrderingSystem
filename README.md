# Pizza Ordering System

This is a console-based Java program that simulates a pizza ordering system using the Factory Method, 
Observer, and Decorator design patterns. The program allows users to order pizzas with extra cheese and/or pepperoni, 
and calculates the total cost of the order. 

**!Unfortunately I wasn't able to pair up with someone else which is why I am submitting this alone. I am sorry for the inconvenience.!**

## How to Run
To run the program, navigate to the root directory of the project and compile the source 
files using the following command:

```java
javac *.java
````

Then, run the program using the following command:
    
```java
java PizzaOrderingSystem
```

The program will prompt the user to enter the type of pizza they want to order, whether they want extra cheese, and whether they want pepperoni. 
The user can enter multiple pizza orders, and the program will keep track of the total cost. To exit the program, the user can enter "done" when prompted for the pizza type.

## Design Patterns
The program uses the following design patterns:

* **Factory Method**: The `NYStylePizzaFactory` class is a concrete implementation of the abstract `PizzaFactory` class. 
It creates `NYStyleCheesePizza` and `NYStylePepperoniPizza` objects based on the user input.

* **Observer**: The `Order` class is a subject that notifies its observers when a new pizza is added or removed from the order. 
The `PizzaOrderObserver` class is an observer that receives updates from the `Order` class and prints a message indicating that a new pizza has been ordered.

* **Decorator**: The `PizzaTopping` class is an abstract decorator class that extends the `Pizza` class. 
The `CheeseTopping` and `PepperoniTopping` classes are concrete decorators that add extra cheese and pepperoni to the pizza, respectively.

## Class Structure

The program consists of the following classes:

* **PizzaFactory**: An abstract class that defines a factory method for creating `Pizza` objects.
* **NYStylePizzaFactory**: A concrete class that extends `PizzaFactory` and creates `NYStyleCheesePizza` and `NYStylePepperoniPizza` objects.
* **Pizza**: An abstract class that represents a pizza. It has a getDescription method and an abstract cost method.
* **NYStyleCheesePizza**: A concrete class that extends `Pizza` and represents a New York style cheese pizza.
* **NYStylePepperoniPizza**: A concrete class that extends `Pizza` and represents a New York style pepperoni pizza.
* **PizzaTopping**: An abstract class that extends `Pizza` and represents a pizza topping decorator. It has an abstract getDescription method.
* **CheeseTopping**: A concrete class that extends `PizzaTopping` and adds extra cheese to the pizza.
* **PepperoniTopping**: A concrete class that extends `PizzaTopping` and adds pepperoni to the pizza.
* **Observer**: An interface that defines the update method for receiving updates from a subject.
* **Subject**: An interface that defines methods for registering, removing, and notifying observers.
* **Order**: A class that implements Subject and represents a pizza order. 
It keeps track of the pizzas in the order and their total cost. It notifies its observers when a new pizza is added or removed.
* **PizzaOrderObserver**: A class that implements `Observer` and prints a message when a new pizza is ordered.
* **PizzaOrderSystem**: The main class that contains the main method for running the program.

## Sample Output
```bash
Enter pizza type (cheese/pepperoni) or 'done' to exit:
cheese
Would you like extra cheese? (y/n):
y
Would you like pepperoni? (y/n):
n
[John] New pizza ordered! Total cost: $14.98
[Emily] New pizza ordered! Total cost: $14.98
Enter pizza type (cheese/pepperoni) or 'done' to exit:
pepperoni
Would you like extra cheese? (y/n):
n
Would you like pepperoni? (y/n):
y
[John] New pizza ordered! Total cost: $32.96
[Emily] New pizza ordered! Total cost: $32.96
Enter pizza type (cheese/pepperoni) or 'done' to exit:
done
Order complete! Total cost: $32.96
```

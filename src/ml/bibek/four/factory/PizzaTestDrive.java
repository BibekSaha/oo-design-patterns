package ml.bibek.four.factory;

import ml.bibek.four.factory.pizza.Pizza;
import ml.bibek.four.factory.store.PizzaStore;
import ml.bibek.four.factory.store.chicago.ChicagoStylePizzaStore;
import ml.bibek.four.factory.store.ny.NYStylePizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

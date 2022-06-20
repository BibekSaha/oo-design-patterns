package ml.bibek.four.factory.store.ny;

import ml.bibek.four.factory.pizza.Pizza;
import ml.bibek.four.factory.pizza.ny.NYStyleCheesePizza;
import ml.bibek.four.factory.store.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese"))
            pizza = new NYStyleCheesePizza();
        return pizza;
    }
}

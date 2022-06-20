package ml.bibek.four.factory.store.chicago;

import ml.bibek.four.factory.pizza.Pizza;
import ml.bibek.four.factory.pizza.chicago.ChicagoStyleCheesePizza;
import ml.bibek.four.factory.store.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        return pizza;
    }
}

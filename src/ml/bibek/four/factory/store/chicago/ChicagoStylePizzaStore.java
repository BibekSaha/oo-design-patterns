package ml.bibek.four.factory.store.chicago;

import ml.bibek.four.factory.ingredients.ChicagoPizzaIngredientsFactory;
import ml.bibek.four.factory.ingredients.PizzaIngredientsFactory;
import ml.bibek.four.factory.pizza.CalmPizza;
import ml.bibek.four.factory.pizza.CheesePizza;
import ml.bibek.four.factory.pizza.Pizza;
import ml.bibek.four.factory.store.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new ChicagoPizzaIngredientsFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equalsIgnoreCase("calm")) {
            pizza = new CalmPizza(ingredientsFactory);
            pizza.setName("Chicago Style Calm Pizza");
        }

        return pizza;
    }
}

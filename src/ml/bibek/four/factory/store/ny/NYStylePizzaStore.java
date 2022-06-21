package ml.bibek.four.factory.store.ny;

import ml.bibek.four.factory.ingredients.NYPizzaIngredientsFactory;
import ml.bibek.four.factory.ingredients.PizzaIngredientsFactory;
import ml.bibek.four.factory.pizza.CalmPizza;
import ml.bibek.four.factory.pizza.CheesePizza;
import ml.bibek.four.factory.pizza.Pizza;
import ml.bibek.four.factory.store.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equalsIgnoreCase("calm")) {
            pizza = new CalmPizza(ingredientsFactory);
            pizza.setName("New York Style Calm Pizza");
        }

        return pizza;
    }
}

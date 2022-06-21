package ml.bibek.four.factory.pizza;

import ml.bibek.four.factory.ingredients.PizzaIngredientsFactory;
import ml.bibek.four.factory.pizza.Pizza;

public class CheesePizza extends Pizza {

    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }
}

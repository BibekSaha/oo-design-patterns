package ml.bibek.four.factory.pizza;

import ml.bibek.four.factory.ingredients.PizzaIngredientsFactory;

public class CalmPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CalmPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        calms = ingredientsFactory.createCalms();
    }
}

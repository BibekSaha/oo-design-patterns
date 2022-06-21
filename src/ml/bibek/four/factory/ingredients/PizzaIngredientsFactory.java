package ml.bibek.four.factory.ingredients;

import ml.bibek.four.factory.ingredients.type.*;

public interface PizzaIngredientsFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Calms createCalms();
}

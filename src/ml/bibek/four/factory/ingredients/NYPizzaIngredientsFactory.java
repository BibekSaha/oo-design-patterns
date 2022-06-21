package ml.bibek.four.factory.ingredients;

import ml.bibek.four.factory.ingredients.impl.*;
import ml.bibek.four.factory.ingredients.impl.veggies.Garlic;
import ml.bibek.four.factory.ingredients.impl.veggies.Mushroom;
import ml.bibek.four.factory.ingredients.impl.veggies.Onion;
import ml.bibek.four.factory.ingredients.impl.veggies.RedPepper;
import ml.bibek.four.factory.ingredients.type.*;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        @SuppressWarnings("Reduntant")
        Veggie[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Calms createCalms() {
        return new FreshClams();
    }
}

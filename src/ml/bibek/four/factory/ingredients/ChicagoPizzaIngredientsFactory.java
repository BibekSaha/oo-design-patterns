package ml.bibek.four.factory.ingredients;

import ml.bibek.four.factory.ingredients.impl.MozzarellaCheese;
import ml.bibek.four.factory.ingredients.impl.SlicedPepperoni;
import ml.bibek.four.factory.ingredients.impl.ThickCrustDough;
import ml.bibek.four.factory.ingredients.impl.veggies.BlackOlives;
import ml.bibek.four.factory.ingredients.impl.veggies.EggPlant;
import ml.bibek.four.factory.ingredients.impl.veggies.Spinach;
import ml.bibek.four.factory.ingredients.type.*;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        @SuppressWarnings("Redunant")
        Veggie[] veggies = { new Spinach(), new EggPlant(), new BlackOlives() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Calms createCalms() {
        return new FrozenClams();
    }
}

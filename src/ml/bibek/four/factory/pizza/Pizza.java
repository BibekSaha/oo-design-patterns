package ml.bibek.four.factory.pizza;

import ml.bibek.four.factory.ingredients.type.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggie[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Calms calms;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baked for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza into official pizza store box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pizza";
    }
}

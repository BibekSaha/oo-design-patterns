package ml.bibek.three.decorator;

public class HouseBlendCoffee extends Beverage {

    public HouseBlendCoffee() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return getTotalCost(.89);
    }
}

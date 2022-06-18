package ml.bibek.three.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return getTotalCost(.10);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip cream";
    }
}

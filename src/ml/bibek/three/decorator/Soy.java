package ml.bibek.three.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return getTotalCost(.15);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}

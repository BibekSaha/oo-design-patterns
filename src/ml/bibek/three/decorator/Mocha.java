package ml.bibek.three.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double cost() {
        return getTotalCost(.20);
    }
}

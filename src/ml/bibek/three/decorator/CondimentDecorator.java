package ml.bibek.three.decorator;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

    protected double getTotalCost(double initialCost) {
        double totalCost = beverage.cost();
        if (beverage.size == BeverageSize.TALL)
            totalCost += initialCost;
        else if (beverage.size == BeverageSize.GRANDE)
            totalCost += initialCost + .05;
        else if (beverage.size == BeverageSize.VENTI)
            totalCost += initialCost + .1;
        return totalCost;
    }
}

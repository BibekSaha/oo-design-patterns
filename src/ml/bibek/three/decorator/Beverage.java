package ml.bibek.three.decorator;

public abstract class Beverage {

    String description = "Unknown beverage";
    BeverageSize size = BeverageSize.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
    }

    public BeverageSize getSize() {
        return this.size;
    }

    protected double getTotalCost(double initialCost) {
        double totalCost = initialCost;
        if (size == BeverageSize.GRANDE)
            totalCost += initialCost + .05;
        else if (size == BeverageSize.VENTI)
            totalCost += initialCost + .1;
        return totalCost;
    }

    public abstract double cost();
}

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

    public abstract double cost();
}

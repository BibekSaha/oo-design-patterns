package ml.bibek.six.prototype;

public abstract class BasicCar implements Cloneable {
    protected String modelName;
    protected int basePrice = 0, onRoadPrice = 0;

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName + "\nOn Road Price: $" + onRoadPrice;
    }

    // Getters and Setters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getOnRoadPrice() {
        return onRoadPrice;
    }

    public void setOnRoadPrice(int onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
    }
}

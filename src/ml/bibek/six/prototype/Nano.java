package ml.bibek.six.prototype;

import java.util.Random;

public class Nano extends BasicCar {

    public Nano(String modelName) {
        this.modelName = modelName;
        // The base price of the nano car
        basePrice = 5000;
        // Set the on-road price
        onRoadPrice = basePrice = (new Random()).nextInt(1000);
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }

    @Override
    public String toString() {
        return "Model:" + modelName + "\nRoad Price: $" + onRoadPrice;
    }
}

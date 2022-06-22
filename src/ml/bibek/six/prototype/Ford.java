package ml.bibek.six.prototype;

import java.util.Random;

public class Ford extends BasicCar {

    public Ford(String modelName) {
        this.modelName = modelName;
        // The base price of the Ford car
        basePrice = 40000;
        // Set the on-road price
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

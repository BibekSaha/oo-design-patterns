package ml.bibek.eleven.builder;

public class Main {

    public static void main(String[] args) {
        // Making the car
        Builder builder = new CarBuilder();
        Director director = new CarDirector();
        Vehicle vehicle = director.instruct(builder);
        vehicle.showProduct();

        // Making the motorcycle
        builder = new MotorCycleBuilder();
        director = new MotorCycleDirector();
        vehicle = director.instruct(builder);
        vehicle.showProduct();
    }
}

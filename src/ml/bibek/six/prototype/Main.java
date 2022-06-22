package ml.bibek.six.prototype;

public class Main {

    private static void printCarDetails(BasicCar car) {
        System.out.println("Editing a cloned model...");
        System.out.println("Model: " + car.getModelName());
        // Editing the on-road price of the car
        // Optional: Step for checking how the clone objects can be manipulated
        car.setOnRoadPrice(car.getOnRoadPrice() + 100);
        System.out.println("It's on-road price: $" + car.getOnRoadPrice());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***");
        CarMaker maker = new CarMaker();

         // Working with nano car
//        BasicCar nano = new Nano("Nano XM624 cc");
        BasicCar nano = maker.getNano();
        System.out.println(nano);
        System.out.println("-------");

        // Getting the cloned version of nano
        BasicCar clonedCar = nano.clone();
        // Working with cloned nano
        printCarDetails(clonedCar);
        System.out.println("-------\n");

        // Working with Ford Car copy
//        BasicCar ford = new Ford("Ford Aspire");
        BasicCar ford = maker.getFord();
        System.out.println(ford);
        System.out.println("-------");

        // Working with the cloned copy
        clonedCar = ford.clone();
        printCarDetails(clonedCar);
        System.out.println("-------\n");
    }
}

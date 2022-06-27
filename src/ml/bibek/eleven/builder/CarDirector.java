package ml.bibek.eleven.builder;

public class CarDirector extends Director {

    // The car director follow
    // its own sequence:
    // Make body -> add wheels -> then add the brand name
    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}

package ml.bibek.eleven.builder;

public abstract class Director {

    // Director knows how use/instruct the
    // builder to create a vehicle
    public abstract Vehicle instruct(Builder builder);
}

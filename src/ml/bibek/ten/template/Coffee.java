package ml.bibek.ten.template;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filters");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
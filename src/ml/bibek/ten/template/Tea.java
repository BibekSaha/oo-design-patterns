package ml.bibek.ten.template;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

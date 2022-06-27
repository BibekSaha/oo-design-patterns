package ml.bibek.ten.template.hooks;

public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("Steeping the tea bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

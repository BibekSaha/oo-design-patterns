package ml.bibek.ten.template.hooks;

public class BeverageTestDrive {

    public static void main(String[] args) {
        TeaWithHook teakHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea....");
        teakHook.prepareRecipe();

        System.out.println("\nMaking coffee....");
        coffeeHook.prepareRecipe();
    }
}

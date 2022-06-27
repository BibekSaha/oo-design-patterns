package ml.bibek.ten.template.hooks;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    // This is a hook because the
    //subclass can override this
    //method, but doesn’t have to.
    // It is a mostly empty that can be override by the sub class
    public boolean customerWantsCondiments() {
        return true;
    }
}

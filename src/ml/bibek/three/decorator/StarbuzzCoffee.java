package ml.bibek.three.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(BeverageSize.GRANDE);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " --> $" + beverage.cost());

        beverage = new HouseBlendCoffee();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " --> $" + beverage.cost());
    }
}

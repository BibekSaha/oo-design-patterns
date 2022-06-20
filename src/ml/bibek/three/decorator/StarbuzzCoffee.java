package ml.bibek.three.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(
                beverage.getDescription() + " --> $" +
                        String.format("%.2f", beverage.cost())
        );

        beverage = new HouseBlendCoffee();
        beverage.setSize(BeverageSize.GRANDE);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(
                beverage.getDescription() + " --> $" +
                        String.format("%.2f", beverage.cost())
        );
    }
}

package ml.bibek.eight.adapter;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        System.out.println("I'm flying short as I'm a turkey");
        duck.fly();
    }
}

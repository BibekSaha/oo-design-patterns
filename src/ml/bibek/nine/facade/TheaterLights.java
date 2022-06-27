package ml.bibek.nine.facade;

public class TheaterLights {
    public void dim(int i) {
        System.out.println("The lights are dimmed down to " + i + " level.");
    }

    public void on() {
        System.out.println("The lights are turned on the full brightness");
    }
}

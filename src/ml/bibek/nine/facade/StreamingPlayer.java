package ml.bibek.nine.facade;

public class StreamingPlayer {
    public void on() {
        System.out.println("The player is turned on");
    }

    public void play(String movie) {
        System.out.println(movie + " is playing");
    }

    public void stop() {
        System.out.println("The movie is stopped");
    }

    public void off() {
        System.out.println("The streaming player is stopped");
    }
}

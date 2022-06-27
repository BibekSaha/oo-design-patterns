package ml.bibek.nine.facade;

public class Amplifier {
    public void on() {
        System.out.println("The Amplifier is turned on");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("The Streaming Player is set");
    }

    public void setSurroundSound() {
        System.out.println("The surround sound system is set");
    }

    public void setVolume(int i) {
        System.out.println("The volume is set to " + i + " levels");
    }

    public void off() {
        System.out.println("The Amplifier is turned off");
    }
}

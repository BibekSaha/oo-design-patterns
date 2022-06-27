package ml.bibek.seven.command;

public class Stereo {

    int volume = 100;

    public void on() {
        System.out.println("The stereo is on...");
    }

    public void off() {
        System.out.println("The stereo is off...");
    }

    public void setCD() {
        System.out.println("The CD is set...");
    }

    public void setVolume(int volume) {
        this.volume = volume % 100;
        System.out.println("The volume is set to " + this.volume + "...");
    }
}

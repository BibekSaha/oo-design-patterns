package ml.bibek.seven.command;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        int prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
        System.out.println("Ceiling Fan is set to HIGH");
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else
            ceilingFan.off();
        System.out.println("Ceiling Fan is set to " + ceilingFan.getSpeed());
    }
}

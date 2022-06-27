package ml.bibek.seven.command;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(5);

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffWithCDCommand);
        remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);

        // Using lambda functions
        // Note: This only works when the interface has only one function to implement
        // remoteControl.setCommand(3, ceilingFan::high, () -> ceilingFan.off());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println();
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println();

        // Macro Commands -> Make one command to execute multiple commands
        Command[] partyOn = { lightOnCommand, stereoOnWithCDCommand, garageDoorOpenCommand };
        Command[] partyOff = { lightOffCommand, stereoOffWithCDCommand, garageDoorCloseCommand };

        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        System.out.println("----- Pushing Macro On -----");
        remoteControl.onButtonWasPushed(4);
        System.out.println("\n----- Pushing Macro off -----");
        remoteControl.offButtonWasPushed(4);

    }
}

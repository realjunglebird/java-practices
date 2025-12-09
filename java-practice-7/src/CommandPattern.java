interface Command {
    void execute();
}

class TV {
    void turnOn() {
        System.out.println("Телевизор включён.");
    }

    void turnOff() {
        System.out.println("Телевизор отключён.");
    }
}

class TurnOnCommand implements Command {
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl rc = new RemoteControl();

        Command turnOnCmd = new TurnOnCommand(tv);
        Command turnOffCmd = new TurnOffCommand(tv);

        rc.setCommand(turnOnCmd);
        rc.execute();

        rc.setCommand(turnOffCmd);
        rc.execute();
    }
}

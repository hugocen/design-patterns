package command.remote.command;

import command.remote.vendor.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.jetsOn();
        hottub.bubblesOn();
    }
    public void undo() {
        hottub.off();
    }

}

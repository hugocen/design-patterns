package command.remote.command;

import command.remote.vendor.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
        hottub.bubblesOff();
        hottub.jetsOff();
    }
    public void undo() {
        hottub.on();
    }

}

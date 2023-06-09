package command.remote.command;

import command.remote.vendor.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv= tv;
    }

    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    public void undo() {
        tv.off();
    }

}

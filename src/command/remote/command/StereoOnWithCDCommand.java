package command.remote.command;

import command.remote.vendor.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.setCD();
        stereo.setVolume(11);
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }

}

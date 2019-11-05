package com.company.command.commands;

import com.company.command.Command;
import com.company.command.objectsForCommands.Stereo;

public class StereoOn implements Command {

    private Stereo stereo;

    public StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOnStereo();
    }
}

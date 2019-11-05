package com.company.command.commands;

import com.company.command.Command;
import com.company.command.objectsForCommands.Stereo;

public class StereoOff implements Command {

    private Stereo stereo;

    public StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOffStereo();
    }
}

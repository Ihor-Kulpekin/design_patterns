package com.company.command.commands;

import com.company.command.Command;
import com.company.command.objectsForCommands.Light;

public class LightOff implements Command {

    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }
}

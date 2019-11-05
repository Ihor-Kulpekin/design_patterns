package com.company.command.commands;

import com.company.command.Command;
import com.company.command.objectsForCommands.Light;

public class LightOn implements Command {

    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }
}

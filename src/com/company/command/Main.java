package com.company.command;

import com.company.command.commands.LightOff;
import com.company.command.commands.LightOn;
import com.company.command.commands.StereoOff;
import com.company.command.commands.StereoOn;
import com.company.command.objectsForCommands.Light;
import com.company.command.objectsForCommands.Stereo;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        remoteControl.setCommand(new LightOn(light));
        remoteControl.buttonWasClicked();
        remoteControl.setCommand(new LightOff(light));
        remoteControl.buttonWasClicked();
        remoteControl.setCommand(new StereoOn(stereo));
        remoteControl.buttonWasClicked();
        remoteControl.setCommand(new StereoOff(stereo));
        remoteControl.buttonWasClicked();

    }
}

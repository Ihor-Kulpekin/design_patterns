package com.company.command;

class RemoteControl {

    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void buttonWasClicked(){
        command.execute();
    }

}

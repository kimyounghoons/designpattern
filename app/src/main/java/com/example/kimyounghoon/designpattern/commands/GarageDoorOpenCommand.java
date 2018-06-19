package com.example.kimyounghoon.designpattern.commands;

import com.example.kimyounghoon.designpattern.interfaces.Command;
import com.example.kimyounghoon.designpattern.models.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.stop();
    }

    @Override
    public void undo() {
    }

}

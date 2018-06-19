package com.example.kimyounghoon.designpattern.commands;

import com.example.kimyounghoon.designpattern.interfaces.Command;
import com.example.kimyounghoon.designpattern.models.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}



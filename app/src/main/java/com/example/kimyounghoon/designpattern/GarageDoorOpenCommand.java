package com.example.kimyounghoon.designpattern;

public class GarageDoorOpenCommand implements Command{

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

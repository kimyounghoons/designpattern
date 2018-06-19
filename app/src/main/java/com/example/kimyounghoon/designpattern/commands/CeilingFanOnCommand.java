package com.example.kimyounghoon.designpattern.commands;

import com.example.kimyounghoon.designpattern.interfaces.Command;
import com.example.kimyounghoon.designpattern.models.CeilingFan;

public  class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;


    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}

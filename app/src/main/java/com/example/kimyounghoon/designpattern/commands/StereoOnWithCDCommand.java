package com.example.kimyounghoon.designpattern.commands;

import com.example.kimyounghoon.designpattern.interfaces.Command;
import com.example.kimyounghoon.designpattern.models.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}

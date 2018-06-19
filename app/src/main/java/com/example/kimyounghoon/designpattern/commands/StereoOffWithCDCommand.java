package com.example.kimyounghoon.designpattern.commands;

import com.example.kimyounghoon.designpattern.interfaces.Command;
import com.example.kimyounghoon.designpattern.models.Stereo;

public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
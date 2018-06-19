package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.commands.GarageDoorOpenCommand;
import com.example.kimyounghoon.designpattern.commands.LightOnCommand;
import com.example.kimyounghoon.designpattern.controls.SimpleRemoteControl;
import com.example.kimyounghoon.designpattern.models.GarageDoor;
import com.example.kimyounghoon.designpattern.models.Light;

import org.junit.Test;

public class RemoteControlTest {

    @Test
    public void test(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("kitchen");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}

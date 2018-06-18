package com.example.kimyounghoon.designpattern;

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

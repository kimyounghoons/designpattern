package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class RemoteControlTest {

    @Test
    public void test(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}

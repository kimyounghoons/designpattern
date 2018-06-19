package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.commands.CeilingFanOffCommand;
import com.example.kimyounghoon.designpattern.commands.CeilingFanOnCommand;
import com.example.kimyounghoon.designpattern.commands.GarageDoorDownCommand;
import com.example.kimyounghoon.designpattern.commands.GarageDoorUpCommand;
import com.example.kimyounghoon.designpattern.commands.LightOffCommand;
import com.example.kimyounghoon.designpattern.commands.LightOnCommand;
import com.example.kimyounghoon.designpattern.commands.StereoOffWithCDCommand;
import com.example.kimyounghoon.designpattern.commands.StereoOnWithCDCommand;
import com.example.kimyounghoon.designpattern.controls.RemoteControl;
import com.example.kimyounghoon.designpattern.models.CeilingFan;
import com.example.kimyounghoon.designpattern.models.GarageDoor;
import com.example.kimyounghoon.designpattern.models.Light;
import com.example.kimyounghoon.designpattern.models.Stereo;

import org.junit.Test;

public class RemoteLoaderTest {

    @Test
    public void Test(){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommand(3,garageDoorUpCommand,garageDoorDownCommand);
        remoteControl.setCommand(4,stereoOnWithCDCommand,stereoOffWithCDCommand);

        System.out.print(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);


        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);


        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);


        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        remoteControl.undoButtonWasPushed();

    }
}

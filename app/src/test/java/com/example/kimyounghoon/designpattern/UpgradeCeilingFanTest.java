package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.commands.UpgradeCeilingFanHighCommand;
import com.example.kimyounghoon.designpattern.commands.UpgradeCeilingFanLowCommand;
import com.example.kimyounghoon.designpattern.commands.UpgradeCeilingFanMediumCommand;
import com.example.kimyounghoon.designpattern.commands.UpgradeCeilingFanOffCommand;
import com.example.kimyounghoon.designpattern.models.UpgradeCeilingFan;

import org.junit.Test;

public class UpgradeCeilingFanTest {

    @Test
    public void test(){
        UpgradeCeilingFan upgradeCeilingFan = new UpgradeCeilingFan("Kitchen");

        UpgradeCeilingFanHighCommand upgradeCeilingFanHighCommand = new UpgradeCeilingFanHighCommand(upgradeCeilingFan);

        upgradeCeilingFanHighCommand.execute();
//        upgradeCeilingFanHighCommand.undo();

        UpgradeCeilingFanMediumCommand upgradeCeilingFanMediumCommand = new UpgradeCeilingFanMediumCommand(upgradeCeilingFan);
        upgradeCeilingFanMediumCommand.execute();
        upgradeCeilingFanMediumCommand.undo();

        UpgradeCeilingFanLowCommand upgradeCeilingFanLowCommand = new UpgradeCeilingFanLowCommand(upgradeCeilingFan);
        upgradeCeilingFanLowCommand.execute();
//        upgradeCeilingFanLowCommand.undo();

        UpgradeCeilingFanOffCommand upgradeCeilingFanOffCommand = new UpgradeCeilingFanOffCommand(upgradeCeilingFan);
        upgradeCeilingFanOffCommand.execute();
        upgradeCeilingFanOffCommand.undo();

    }
}

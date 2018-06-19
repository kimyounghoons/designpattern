package com.example.kimyounghoon.designpattern;

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

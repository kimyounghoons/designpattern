package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class UpgradeRemoteControlTest {

    @Test
    public void test() {
        UpgradeRemoteControl remote = new UpgradeRemoteControl();
        UpgradeCeilingFan upgradeCeilingFan = new UpgradeCeilingFan("kitchen");

        UpgradeCeilingFanMediumCommand upgradeCeilingFanMediumCommand = new UpgradeCeilingFanMediumCommand(upgradeCeilingFan);

        UpgradeCeilingFanOffCommand upgradeCeilingFanOffCommand = new UpgradeCeilingFanOffCommand(upgradeCeilingFan);

        UpgradeCeilingFanHighCommand upgradeCeilingFanHighCommand = new UpgradeCeilingFanHighCommand(upgradeCeilingFan);

        remote.setCommand(0,upgradeCeilingFanMediumCommand,upgradeCeilingFanOffCommand);
        remote.setCommand(1,upgradeCeilingFanHighCommand,upgradeCeilingFanOffCommand);

        System.out.print(remote);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

    }
}

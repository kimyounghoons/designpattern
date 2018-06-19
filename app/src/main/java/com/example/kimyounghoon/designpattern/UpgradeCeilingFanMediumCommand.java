package com.example.kimyounghoon.designpattern;

public class UpgradeCeilingFanMediumCommand implements Command {
    UpgradeCeilingFan upgradeCeilingFan;
    int prevSpeed;

    public UpgradeCeilingFanMediumCommand(UpgradeCeilingFan upgradeCeilingFan) {
        this.upgradeCeilingFan = upgradeCeilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = upgradeCeilingFan.getSpeed();
        upgradeCeilingFan.medium();
    }

    @Override
    public void undo() {
        if (prevSpeed == UpgradeCeilingFan.HIGH) {
            upgradeCeilingFan.high();
        } else if (prevSpeed == UpgradeCeilingFan.MEDIUM) {
            upgradeCeilingFan.medium();
        } else if (prevSpeed == UpgradeCeilingFan.LOW) {
            upgradeCeilingFan.low();
        } else if (prevSpeed == UpgradeCeilingFan.OFF) {
            upgradeCeilingFan.off();
        }
    }
}

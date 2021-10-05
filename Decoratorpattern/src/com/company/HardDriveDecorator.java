package com.company;

public class HardDriveDecorator extends MotherboardDecorator {

    public HardDriveDecorator(Computer computer) {
        super(computer);
    }

    public String compwork() {
        return "Hard drive is added. ";
    }

    @Override
    public String work() {
        return super.work() + compwork();
    }
}

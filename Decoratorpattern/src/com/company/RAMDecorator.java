package com.company;

public class RAMDecorator extends MotherboardDecorator {

    public RAMDecorator(Computer computer) {
        super(computer);
    }

    public String compwork() {
        return "RAM is added. ";
    }

    @Override
    public String work() {
        return super.work() + compwork();
    }
}

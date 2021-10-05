package com.company;

public class CPUDecorator extends MotherboardDecorator {

    public CPUDecorator(Computer computer) {
        super(computer);
    }

    String compwork(){
        return "CPU is added. ";
    }

    @Override
    public String work() {
        return super.work() + compwork();
    }
}

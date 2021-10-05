package com.company;

public abstract class MotherboardDecorator implements Computer {

    Computer computer;

    public MotherboardDecorator(Computer computer) {
        this.computer = computer;
    }



    public String work() {
        return computer.work();
    }
}

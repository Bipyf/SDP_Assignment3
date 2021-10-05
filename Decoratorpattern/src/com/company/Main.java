package com.company;

public class Main {
    public static void main(String[] args) {
        Computer computer = new HardDriveDecorator(new CPUDecorator( new RAMDecorator(new Motherboard())));
        System.out.println(computer.work());
    }
}

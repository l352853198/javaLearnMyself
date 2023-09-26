package com.example.javalearn.aop;

public class ElectricCar  implements Rechargable, Vehicle {
    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }

    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }
}

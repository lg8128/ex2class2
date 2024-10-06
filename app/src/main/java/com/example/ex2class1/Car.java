package com.example.ex2class1;

public class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("the car started driving");
    }
    public void Stop(){
        System.out.println("the car stopped driving");
    }
    public void Eccelerate(){
        System.out.println("the car speed up");
    }
}

package com.knoldus.learning.solid;

class Vehicle {
    public void startEngine(){

    }

    public static void main(String [] a){
        Vehicle v = new Vehicle();
        v.startEngine();
        Vehicle b = new Vehicle();
        b.startEngine();
    }
}

class Car extends EngineVehicle{

}

class BiCycle extends NonEngineVehicle{
    public void startEngine() throws Exception {
        throw new Exception("Start Engine not supported");
    }
}

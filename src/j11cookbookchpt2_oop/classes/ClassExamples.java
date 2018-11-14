/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes;

import j11cookbookchpt2_oop.classes.example1.CarV1;
import j11cookbookchpt2_oop.classes.example1.EngineV1;
import j11cookbookchpt2_oop.classes.example1.VehicleV1;

/**
 *
 * @author ngke
 */
public class ClassExamples {
    
    /**
     * Example 1: 
     * 
     * Simple Vehicle and Engine Example each are separate classes
     * 
     * Notes on Example 1: 
     *    There are points where NullPointerExceptions can occur especially if
     * null is passed into the VehicleV1 constructor. To avoid ambiguous 
     * NullPointers, we can add exceptions at places where the engine is required
     * or in the constructor. 
     * 
     * We can extend the Vehicle class and create a Car. We can add parameters 
     * it follows the same rules as before.
     * 
     * Also throwing runtime errors do not require a function to be surrounded 
     * by a try catch block. 
     */
    public void executeExample1() {
        EngineV1 engine = new EngineV1();
        engine.setHorsePower(200);
        
        VehicleV1 vehicle = new VehicleV1(2000, engine);
        System.out.println("Vehicle's Speed " + vehicle.getSpeedMph(1));
        
        try {
            System.out.println("Creating a vehicle with no engine");
            VehicleV1 badVehicle = new VehicleV1(2000, null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        CarV1 car = new CarV1(5, 1000, engine);
        
        double timeSec = 10.0;
        System.out.println("Car speed (" + timeSec + " sec) = " + car.getSpeedMph(timeSec) + " mph");
    }
    
}

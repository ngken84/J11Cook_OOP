/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes;

import j11cookbookchpt2_oop.classes.example01.CarV1;
import j11cookbookchpt2_oop.classes.example01.EngineV1;
import j11cookbookchpt2_oop.classes.example01.VehicleV1;
import j11cookbookchpt2_oop.classes.example02.VehicleV2;
import j11cookbookchpt2_oop.classes.example03.VehicleV3;

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
    public void executeExample01() {
        System.out.println("\nEXAMPLE 01 - Classes and Inheritance Examples");
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
    
    public void executeExample02() {
        System.out.println("\nEXAMPLE 02 - Inner Class Example");
        VehicleV2 vehicle = new VehicleV2(2000, 100);
        double timeSec = 10.0;
        System.out.println("Car speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");
    }
    
    public void executeExample03() {
        System.out.println("\nEXAMPLE 03 - Method-Local Inner Class Example");
        VehicleV3 vehicle = new VehicleV3(2000, 100);
        double timeSec = 10.0;
        System.out.println("Car speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");
    }
    
    public void executeExample04() {
        System.out.println("\nEXAMPLE 04 - Anonymous Inner Class Example"); 
        VehicleV2 vehicle = new VehicleV2(2000, 100) {

            @Override
            public double getSpeedMph(double timeSec) {
                return -1.0d;
            }
            
        };
        double timeSec = 10.0;
        System.out.println("Car speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");
        
    }
    
    
    
}

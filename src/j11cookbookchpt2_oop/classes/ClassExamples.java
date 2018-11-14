/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes;

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
     */
    public void executeExample1() {
        EngineV1 engine = new EngineV1();
        engine.setHorsePower(200);
        
        VehicleV1 vehicle = new VehicleV1(2000, engine);
        System.out.println("Vehicle's Speed " + vehicle.getSpeedMph(1));
    }
    
}

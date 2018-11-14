/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example1;

/**
 *
 * @author ngke
 */
public class VehicleV1 {
    private int weightPounds;
    private EngineV1 engine;

    public VehicleV1(int weightPounds, EngineV1 engine) {
        this.weightPounds = weightPounds;
        this.engine = engine;
    }
    
    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec, weightPounds);
    }
    
}

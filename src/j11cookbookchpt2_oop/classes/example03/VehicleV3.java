/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example03;

/**
 *
 * @author ngke
 */
public class VehicleV3 {
    
    private int weightPounds;
    private int horsePower;

    public VehicleV3(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }
    
    private int getWeightPounds() {
        return weightPounds;
    }
    
    public double getSpeedMph(double timeSec) {
        class EngineV3 {
            private int horsePower;
            
            private EngineV3 (int horsePower) {
                this.horsePower = horsePower;
            } 
            
            private double getSpeedMph(double timeSec) {
                double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 /
                        getWeightPounds();
                return Math.round(Math.sqrt(v) * 0.68);
            }
        }
        EngineV3 engine = new EngineV3(this.horsePower);
        return engine.getSpeedMph(timeSec);
    }
}

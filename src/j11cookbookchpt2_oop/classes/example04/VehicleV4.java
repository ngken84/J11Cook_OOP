/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example04;

/**
 *
 * @author ngke
 */
public class VehicleV4 {
    
    private Engine engine;
    
    public VehicleV4(int weightPounds, int horsePower) {
        this.engine = new Engine(horsePower, weightPounds);
    }
    
    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec);
    }
    
    private static class Engine {
        private int horsePower;
        private int weightPounds;

        private Engine(int horsePower, int weightPounds) {
            this.horsePower = horsePower;
            this.weightPounds = weightPounds;
        }
        
        private double getSpeedMph(double timeSec) {
            double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 /
                    this.weightPounds;
            return Math.round(Math.sqrt(v) * 0.68);
        }
    }
}

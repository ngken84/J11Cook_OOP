/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example02;

/**
 *
 * @author ngke
 */
public class VehicleV2 {
    private int weightPounds;
    private EngineV2 engine;

    public int getWeightPounds() {
        return weightPounds;
    }

    public VehicleV2(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.engine = new EngineV2(horsePower);
    }
    
    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec);
        //NOTE: it can access a private method of an inner class!
    }
    
    private class EngineV2 {
        private int horsePower;

        public EngineV2(int horsePower) {
            this.horsePower = horsePower;
        }
        
        private double getSpeedMph(double timeSec) {
            double v = 2.0 * this.horsePower * 746 * timeSec * 32.17/ getWeightPounds();
            // NOTE: IT USES THE PARENT CLASS'S getWeightPounds() function!
            return Math.round(Math.sqrt(v) * 0.68);
        }
    }
}

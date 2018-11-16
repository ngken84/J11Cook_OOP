/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example05;

/**
 *
 * @author ngke
 */
public class VehicleV5 {
    
    private int weightPounds, horsePower;

    public VehicleV5(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }
    
    public int getTotalWeight() {
        return this.weightPounds;
    }
    
    public double getSpeedMph(double timeSec) {
        double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 / getTotalWeight();
        return Math.round(Math.sqrt(v) * 0.68);
    }
}

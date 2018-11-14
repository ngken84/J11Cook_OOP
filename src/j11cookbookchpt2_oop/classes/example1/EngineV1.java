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
public class EngineV1 {
    
    private int horsePower;

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    public double getSpeedMph(double timeSec, int weightPounds) {
        double v = 2.0 * this.horsePower * 746 * timeSec * 32.17/weightPounds;
        return Math.round(Math.sqrt(v) * 0.68);
    }
    
    
}

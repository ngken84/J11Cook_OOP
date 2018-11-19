/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example06;

/**
 *
 * @author ngke
 */
public class VehicleV6 {
    private SpeedModel speedModel;
    private int weightPounds, horsePower;

    public VehicleV6(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }
    
    public void setSpeedModel(SpeedModel speedModel) {
        this.speedModel = speedModel;
    }
    
    public double getSpeedMph(double timeSec) {
        return this.speedModel.getSpeedMph(timeSec, weightPounds, horsePower);
    }
}

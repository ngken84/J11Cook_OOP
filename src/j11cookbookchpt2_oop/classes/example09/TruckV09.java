/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example09;

/**
 *
 * @author ngke
 */
public class TruckV09 implements VehicleV09 {
    
    private int payloadPounds, weightPounds, horsePower;

    public TruckV09(int payloadPounds, int weightPounds, int horsePower) {
        this.payloadPounds = payloadPounds;
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int getPayloadPounds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

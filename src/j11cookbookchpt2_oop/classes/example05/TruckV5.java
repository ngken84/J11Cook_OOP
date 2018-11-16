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
public class TruckV5 extends VehicleV5 {
    
    private int payload;

    public TruckV5(int payload, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }
    
    public int getTotalWeight() {
        return this.payload + super.getTotalWeight();
    }

}

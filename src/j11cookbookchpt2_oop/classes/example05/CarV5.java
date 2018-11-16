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
public class CarV5 extends VehicleV5 {
    
    private int passengerCount; 

    public CarV5(int passengerCount, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
    
    public int getTotalWeight() {
        return this.passengerCount * 250 + super.getTotalWeight();
    }
    
}

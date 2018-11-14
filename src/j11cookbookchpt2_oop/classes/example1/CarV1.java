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
public class CarV1 extends VehicleV1 {
    private int passengerCount;

    public CarV1(int passengerCount, int weightPounds, EngineV1 engine) {
        super(weightPounds, engine);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
    
}

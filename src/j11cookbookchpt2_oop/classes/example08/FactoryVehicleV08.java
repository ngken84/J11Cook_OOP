/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example08;

/**
 *
 * @author ngke
 */
public class FactoryVehicleV08 {
    public static CarV08 buildCar(int passengersCount, int weightPounds, int horsePower) {
        return new CarImpl(passengersCount, weightPounds, horsePower);
    }
    
    public static TruckV08 buildTruck(int payloadPounds, int weightPounds, int horsePower) {
        return new TruckImpl(payloadPounds, weightPounds, horsePower);
    }
    
    public static class CrewCab extends VehicleImpl implements CarV08, TruckV08 {

        private int payloadPounds, passengerCount;

        public CrewCab(int payloadPounds, int passengerCount, int weightPounds, int horsePower) {
            super(weightPounds + payloadPounds + 250 * passengerCount, horsePower);
            this.payloadPounds = payloadPounds;
            this.passengerCount = passengerCount;
        }
        
        
        @Override
        public int getPassengersCount() {
            return passengerCount;
        }

        @Override
        public int getPayloadPounds() {
            return payloadPounds;
        }
        
    }
    
    private static class CarImpl extends VehicleImpl implements CarV08 {
        private int passengersCount;

        public CarImpl(int passengersCount, int weightPounds, int horsePower) {
            super(weightPounds + passengersCount * 250, horsePower);
            this.passengersCount = passengersCount;
        }

        public int getPassengersCount() {
            return passengersCount;
        }
    }
    
    private static class TruckImpl extends VehicleImpl implements TruckV08 {
        private int payloadPounds;

        public TruckImpl(int payloadPounds, int weightPounds, int horsePower) {
            super(weightPounds + payloadPounds, horsePower);
            this.payloadPounds = payloadPounds;
        }

        public int getPayloadPounds() {
            return payloadPounds;
        }
        
    }
    
    private static abstract class VehicleImpl implements VehicleV08 {
        private SpeedModel speedModel;
        private int weightPounds, horsePower;

        public VehicleImpl(int weightPounds, int horsePower) {
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
}

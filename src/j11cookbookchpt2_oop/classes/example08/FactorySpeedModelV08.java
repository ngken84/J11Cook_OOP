/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example08;

import java.util.Properties;

/**
 *
 * @author ngke
 */
public class FactorySpeedModelV08 {
    
    public static SpeedModel generateSpeedModel (Properties drivingConditions) {
        if(drivingConditions.getProperty("roadCondition", "Dry").equals("Wet")) {
            return new SpeedModelWet();
        } else {
            return new SpeedModelDry();
        }
    }
    
    private static class SpeedModelWet implements SpeedModel {

        @Override
        public double getSpeedMph(double timeSec, int weightPounds, int horsePower) {
            double v = 2.0 * horsePower * 746 * timeSec * 32.17 / weightPounds - 5;
            return Math.round(Math.sqrt(v * 0.68) - 2);        
        }
        
    }
    
    private static class SpeedModelDry implements SpeedModel {

        @Override
        public double getSpeedMph(double timeSec, int weightPounds, int horsePower) {
            double v = 2.0 * horsePower * 746 * timeSec * 32.17 / weightPounds;
            return Math.round(Math.sqrt(v * 0.68) - 5);        
        }
         
    }
}

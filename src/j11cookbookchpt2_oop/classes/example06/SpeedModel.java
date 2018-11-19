/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.classes.example06;

import java.util.Properties;

/**
 *
 * @author ngke
 */
public class SpeedModel {
    private Properties conditions;
    public SpeedModel(Properties drivingConditions) {
        this.conditions = drivingConditions;
    }
    
    public double getSpeedMph(double timeSec, int weightPounds, int horsePower) {
        String road = conditions.getProperty("roadCondition", "Dry");
        String tire = conditions.getProperty("tireCondition", "New");
        
        double v = 2.0 * horsePower * 746 * timeSec * 32.17 / weightPounds;
        return Math.round(Math.sqrt(v)*0.68) - (road.equals("Dry") ? 2 : 5)
                - (tire.equals("New") ? 0 :5 );
    }
}

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
public interface VehicleV09 {
    
    int getPayloadPounds();
    
    default int getPayloadKg(int pounds) {
        return convertPoundsToKg(pounds);
    }
    
    static int convertKgToPounds(int kilograms) {
        return (int) Math.round(2.205 * kilograms);
    }
    
    static int convertPoundsToKg(int pounds) {
        return (int) Math.round(0.454 * pounds);
    }
    
    
}

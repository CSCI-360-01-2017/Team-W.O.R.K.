/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author MatthewKay
 */
public class Radio {

    private double stationNumFM;
    private int stationNumAM;
    private boolean isAM;
    private boolean isON;
    private int volume;
    
    public Radio() {
        
        stationNumFM = 0;
        stationNumAM = 0;
        isAM = false;
        isON = false;
        volume = 0;
}
    
    public void setStationNumFM(double x){
        stationNumFM = x;
    }
    
    public void setStationNumAM(int x){
        stationNumAM = x;
    }
    
    public void setradioSetting(boolean x){
        isAM = x;
    }
    
    public double getStationNumFM(){
       return stationNumFM;
    }
    
    public int getStationNumAM(){
       return stationNumAM;
    }
    
    public boolean getRadioSetting(){
       return isAM;
    }

    public boolean isIsON() {
        return isON;
    }

    public void setIsON(boolean isON) {
        this.isON = isON;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
  
    
    
    
    
   
    
    
    
    
    
    
    
}

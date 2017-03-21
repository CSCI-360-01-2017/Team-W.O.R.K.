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
    
    public Radio() {
        
        stationNumFM = 0;
        stationNumAM = 0;
        isAM = false;
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
    public static void main(String[] args) {
        int x = 0;
        Radio rad = new Radio();
        rad.setStationNumFM(95.5);
        rad.setStationNumAM(1000);
        System.out.println(rad.getStationNumAM());
        System.out.println(rad.getStationNumFM());
        System.out.println(rad.getRadioSetting());
        
    }
    
    
    
   
    
    
    
    
    
    
    
}

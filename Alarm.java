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
public class Alarm {
    	private int alarmNum;
        private int hours;
        private int minutes;
        private int seconds;
        private boolean isPM;
        private boolean isAlarmON;
        private boolean isGoingOff;

public Alarm(int alarmNum, int hours, int minutes, boolean isPm, boolean isAlarmON) {
    this.alarmNum = alarmNum;
    this.hours = hours;
    this.minutes = minutes;
    this.isPM = true;
    this.isAlarmON  = false;
    }

             	
 public boolean getIsPM() throws NullPointerException{
    if(this == null){
        throw new NullPointerException();
    }
    return isPM;
 }          
     	
 public int getAlarmNum(){
    return alarmNum;
 }
              	
 public boolean getIsAlarmON() {
    return isAlarmON;
}
 
 public int getHours(){
    return hours;
 }
 
public int getMinutes(){
    return  minutes;
}

public void setIsAlarmON(boolean AlarmON) {
    this.isAlarmON = AlarmON;
}

public void setHours(int hours){
    this.hours = hours;
}

public void setMinutes(int minutes){
    this.minutes = minutes;
}
 
public void setIsPM(boolean isPM) {
    this.isPM = isPM;
}

    /**
     * @return the isGoingOff
     */
    public boolean isIsGoingOff() {
        return isGoingOff;
    }

    /**
     * @param isGoingOff the isGoingOff to set
     */
    public void setIsGoingOff(boolean isGoingOff) {
        this.isGoingOff = isGoingOff;
    }

    /**
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }






 
              	











}



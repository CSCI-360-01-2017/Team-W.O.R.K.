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
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isPM;
    public Alarm alarm1;
    public Alarm alarm2;

    public void Clock(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.isPM = false;      
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setIsPM(boolean isPM) {
        this.isPM = isPM;
    }
    
    public void setAlarm1(int hours1, int minutes1, boolean isPM1){
        alarm1 = new Alarm(1, hours1, minutes1, isPM1,false);
        
    }
    public void setAlarm2(int hours1, int minutes1, boolean isPM1){
        alarm2 = new Alarm(2, hours1, minutes1, isPM1,false);
        
    }
    
    public void setAlarm1ON(boolean isON){
        alarm1.setIsAlarmON(isON);
        
    }
    public void setAlarm2ON(boolean isON){
        alarm2.setIsAlarmON(isON);
        
    }
    

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isIsPM() {
        return isPM;
    }
    
    public String toString(){
        
        String rtnVal = hours + ":" + minutes + ":"
        + seconds;
        
        
        if(isPM){
            rtnVal+= " PM\n";
        }
        else{
            rtnVal+= " AM\n";
        }
     return rtnVal;
    
    }
    
    public void incrementClock(){
       seconds++;
       if(seconds == 60){
           seconds = 0;
           minutes++;
       }
       if(minutes == 60){
           minutes = 0;
           hours++;
           
       }
       if(hours == 12 && isPM == true){
           isPM = false;   
           
       }
       if(hours == 12 && isPM == false){
           isPM = true;   
           
       }
       if(hours == 13){
           hours = 1;
           
       }
         
           
       
       
       
              
         
    }
    
      public boolean checkAlarm1(int hours,int minutes,int seconds,boolean isPM){
        if(this.alarm1.getHours() == hours && this.alarm1.getMinutes() == minutes && this.alarm1.getIsPM()== isPM && this.alarm1.getSeconds() == seconds){
            return true;
        }
        else{
            return false;
        }
    }
      public boolean checkAlarm2(int hours,int minutes,int seconds,boolean isPM){
        if(this.alarm2.getHours() == hours && this.alarm2.getMinutes() == minutes && this.alarm2.getIsPM()== isPM && this.alarm2.getSeconds() == seconds ){
            return true;
        }
        else{
            return false;
        }
    }
      
      public void activateAlarm1(){
          this.alarm1.setIsGoingOff(true);
      }
      public void activateAlarm2(){
          this.alarm2.setIsGoingOff(true);
      }
      public void deactivateAlarm1(){
          this.alarm1.setIsGoingOff(false);
      }
      public void deactivateAlarm2(){
          this.alarm2.setIsGoingOff(false);
      }
      //add variable snooze time
    public void snoozealarm1(){
        this.alarm1.setMinutes(minutes + 1);
        this.alarm1.setSeconds(seconds);
        this.alarm1.setIsGoingOff(false);
    }
    public void snoozealarm2(){
        this.alarm2.setMinutes(minutes + 1);
        this.alarm1.setSeconds(seconds);
        this.alarm2.setIsGoingOff(false);
    }
    
    
    
    

    }
    
   


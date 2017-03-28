/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author MatthewKay
 */
public class SystemController {

    private Clock clock1;
    private Timer timer;

    public SystemController(){
        
        clock1 = new Clock();
        clock1.setHours(11);
        clock1.setMinutes(59);
        clock1.setSeconds(55);
        clock1.setIsPM(false);
        this.timer = new Timer();
        
        clock1.setAlarm1(12,0, true);
        clock1.setAlarm2(12,1, true);
 
        clock1.setAlarm1ON(false);
        clock1.setAlarm2ON(false);
        
    }
      public void runSystem(){
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                clock1.incrementClock();
               
                if(clock1.checkAlarm1(clock1.getHours(), clock1.getMinutes() ,clock1.getSeconds(), clock1.isIsPM()) && clock1.alarm1.getIsAlarmON()==true ){
                    clock1.activateAlarm1();
                }
                
                if(clock1.alarm1.isIsGoingOff()){
                    System.out.println("Alarm1 goign off");
                }
//               if(clock1.getHours() == 12 && clock1.getMinutes()== 3){
//                   clock1.snoozealarm1();
//               }
//               if(clock1.getHours() == 12 && clock1.getMinutes()== 2){
//                   
//                   clock1.snoozealarm2();
//               }
  
               if(clock1.checkAlarm2(clock1.getHours(), clock1.getMinutes(),clock1.getSeconds(), clock1.isIsPM()) && clock1.alarm2.getIsAlarmON()==true){
                    clock1.activateAlarm2();
         
                }
  
                if(clock1.alarm2.isIsGoingOff()){
                    System.out.println("Alarm2 goign off");
                }
                
                System.out.println(clock1.toString());
            }
        }, 0,1000);
  
    }
      
    
    
      
      
      
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemController test = new SystemController();
        test.runSystem();
        
    }
    
}

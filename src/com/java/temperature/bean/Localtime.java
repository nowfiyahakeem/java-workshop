package com.java.temperature.bean;
import java.time.LocalTime;

public class Localtime {

    public static void main(String[] args) {
        LocalTime currenttime = LocalTime.now();
        LocalTime registrationendtime  = LocalTime.of (9,6, 0);
        int hrs = registrationendtime.getHour() - currenttime.getHour();
        int min = registrationendtime.getMinute() - currenttime.getMinute();
        int sec = registrationendtime.getSecond() -+  currenttime.getSecond();
        System.out.println("Current time is: " + hrs + ":" + min + ":" + sec);
    }
    
}

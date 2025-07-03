package com.java.temperature.bean;

public class Building {
    private String  name;
    private String area;
    private double floor;
    privatel localdatetime opendatetime;
    private localdatetime closedatetime;
         
    //getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String aname) {
        this.name = aname;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String aarea) {
        this.area = aarea;
    }

    public double getFloor() {
        return floor;
    }
    public void setFloor(double afloor) {
        this.floor = afloor;
    }
    public double getOpenDateTime() {
        return opendatetime;
    }
    public void setOpenDateTime(double aopendatetime) {
        this.opendatetime = aopendatetime;
    }
    public double getCloseDateTime() {
        return closedatetime;
    }
    public void setCloseDateTime(double aclosedatetime) {
        this.closedatetime = aclosedatetime;
        System.out.println("Close Date Time set to: " + aclosedatetime);
    }


}

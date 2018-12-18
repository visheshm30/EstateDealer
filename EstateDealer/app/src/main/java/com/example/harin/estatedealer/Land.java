package com.example.harin.estatedealer;

public class Land {

    String state;
    String city;
    String area;
    String pin;

    public Land(String state,String city,String area,String pin)
    {
        this.state=state;
        this.city=city;
        this.area=area;
        this.pin=pin;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public String getPin() {
        return pin;
    }
}

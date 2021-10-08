package com.example.earthquakefinder;

public class Earthquake {
    private Double mag;
    private String place;
    private long date;
    private double mMagnitude;
    private String url;

    public Earthquake(Double magnitude, String place, long date, String url){
        this.mag = magnitude;
        this.place = place;
        this.date = date;
        this.url = url;
    }

    public Double getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public long getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}

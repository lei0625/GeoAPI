package com.lei.entity;

/**
 * @author lei
 * @create 2022-07-06-6:56 PM
 */
public class LocationEvent {

    Float lat;
    Float lon;
    Long time;
    String ext;

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "LocationEvent{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", time=" + time +
                ", ext='" + ext + '\'' +
                '}';
    }
}

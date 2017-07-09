package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.LocationBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class LocationBean {

    private int id;
    private String name;
    private CityBean city;
    private double latitude;
    private double longitude;


    public LocationBean(JSONObject object) {
        try {
            id = object.getInt("id");
            name = object.getString("name");
            city = new CityBean(new JSONObject(object.getString("city")));
            latitude = object.getDouble("latitude");
            longitude = object.getDouble("longitude");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

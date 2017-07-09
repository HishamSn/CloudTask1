package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class ModelBean {

    private int id;
    private String name;
    private String creationDate;
    private String expiryDate;

    public ModelBean(JSONObject object) {
        try {
            id = object.getInt("id");
            name = object.getString("name");
            creationDate = object.getString("creationDate");
            expiryDate = object.getString("expiryDate");
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}

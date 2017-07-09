package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.LocationBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class CountryBean {
    private int id;
    private String name;


    public CountryBean(JSONObject object) {

        try {
            id = object.getInt("id");
            name = object.getString("name");
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
}

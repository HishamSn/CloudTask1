package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.StatusBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class StatusBean {

    private int id;
    private String statusValue;
    private DangerLevelBean dangerLevel;

    public StatusBean(JSONObject object) {
        try {
            id = object.getInt("id");
            statusValue = object.getString("statusValue");
            dangerLevel = new DangerLevelBean(new JSONObject(object.getString("dangerLevel")));
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

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public DangerLevelBean getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(DangerLevelBean dangerLevel) {
        this.dangerLevel = dangerLevel;
    }
}

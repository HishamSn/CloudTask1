package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.StatusBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class DangerLevelBean {

    private int id;
    private String dangerLevelName;
    private int dangerLevelIntValue;
    private boolean actionRequired;


    public DangerLevelBean(JSONObject object) {

        try {
            id = object.getInt("id");
            dangerLevelName = object.getString("dangerLevelName");
            dangerLevelIntValue = object.getInt("dangerLevelIntValue");
            actionRequired = object.getBoolean("actionRequired");
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

    public String getDangerLevelName() {
        return dangerLevelName;
    }

    public void setDangerLevelName(String dangerLevelName) {
        this.dangerLevelName = dangerLevelName;
    }

    public int getDangerLevelIntValue() {
        return dangerLevelIntValue;
    }

    public void setDangerLevelIntValue(int dangerLevelIntValue) {
        this.dangerLevelIntValue = dangerLevelIntValue;
    }

    public boolean isActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(boolean actionRequired) {
        this.actionRequired = actionRequired;
    }
}

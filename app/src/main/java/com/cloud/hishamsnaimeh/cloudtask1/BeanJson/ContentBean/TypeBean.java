package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class TypeBean {

    private int id;
    private String machineTypeName;

    public TypeBean(JSONObject object) {
        try {
            id = object.getInt("id");
            machineTypeName = object.getString("machineTypeName");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getMachineTypeName() {
        return machineTypeName;
    }

    public void setMachineTypeName(String machineTypeName) {
        this.machineTypeName = machineTypeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

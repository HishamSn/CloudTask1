package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean;

import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.LocationBean.LocationBean;
import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.StatusBean.StatusBean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class ContentBean {
    private int id;
    private String name;
    private String ipAddress;
    private String deviceIPSubnetMask;
    private ModelBean model;
    private LocationBean location;
    private StatusBean status;
    private TypeBean type;
    private String serialNum;


    public ContentBean(JSONObject object) {

        try {
            id = object.getInt("id");
            name = object.getString("name");
            ipAddress = object.getString("ipAddress");
            deviceIPSubnetMask = object.getString("deviceIPSubnetMask");
            model = new ModelBean(new JSONObject(object.getString("model")));
            location = new LocationBean(new JSONObject(object.getString("location")));
            status = new StatusBean(new JSONObject(object.getString("status")));
            type = new TypeBean(new JSONObject(object.getString("type")));
            serialNum = object.getString("serialNum");
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDeviceIPSubnetMask() {
        return deviceIPSubnetMask;
    }

    public void setDeviceIPSubnetMask(String deviceIPSubnetMask) {
        this.deviceIPSubnetMask = deviceIPSubnetMask;
    }

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public TypeBean getType() {
        return type;
    }

    public void setType(TypeBean type) {
        this.type = type;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
}

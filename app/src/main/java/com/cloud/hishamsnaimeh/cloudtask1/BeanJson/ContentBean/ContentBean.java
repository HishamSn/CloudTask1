package com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean;

import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.LocationBean.LocationBean;
import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.StatusBean.StatusBean;

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
}

package com.cloud.hishamsnaimeh.cloudtask1.Connection;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.DataBean;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public abstract class Requests {
    public Requests() {
        try {
            makeStringRequest();
        } catch (Exception ignored) {

        }
    }

    private void makeStringRequest() {

        String url = "http://zero1tec.com/cloud/sample.json";
        StringRequest StringRequest = new StringRequest(Request.Method.GET, url
                , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {


                try {
                    listenerRequest(true, new DataBean(new JSONObject(response)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error.Response", String.valueOf(error));
                listenerRequest(false, null);
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parameter = new HashMap<>();

                return parameter;
            }
        };
        StartUp.getInstance().addToRequestQueue(StringRequest, "");
    }

    public abstract void listenerRequest(boolean flag, DataBean data);

}

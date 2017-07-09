package com.cloud.hishamsnaimeh.cloudtask1.Connection;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class StartUp  extends Application {

    protected static StartUp application;
    private SharedPreferences preferences;

    private RequestQueue mRequestQueue;



    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onCreate() {
        super.onCreate();
        application = this;
        this.preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }


    public static StartUp getInstance() {
        return application;
    }

    public SharedPreferences getPreferences() {
        return this.preferences;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        req.setTag(TextUtils.isEmpty(tag) ? "" : tag);
        getRequestQueue().add(req);
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }
}
package com.cloud.hishamsnaimeh.cloudtask1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.ContentBean;
import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.DataBean;
import com.cloud.hishamsnaimeh.cloudtask1.Connection.Requests;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView Pages,Elements,sort,first,Last;
    Activity activity;
    ListView simpleList;
    List<ContentBean> contentList;
    Adapter cAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        simpleList = (ListView) findViewById(R.id.simpleList);
        contentList = new ArrayList<>();
        init();


        new Requests() {
            @Override
            public void listenerRequest(boolean flag, DataBean data) {
                cAdapter = new Adapter(activity, data.getContent());
                simpleList.setAdapter(cAdapter);
                Pages.setText(Integer.toString(data.getTotalPages()));
                Elements.setText(Integer.toString(data.getTotalElements()));
                sort.setText(""+data.getSort());
                first.setText(""+data.isFirst());
                Last.setText(""+data.isLast());

            }
        };


    }


    public void init()
    {
        Pages=(TextView)findViewById(R.id.PagesC);
        Elements=(TextView)findViewById(R.id.ElementsC);
        sort=(TextView)findViewById(R.id.sortC);
        first=(TextView)findViewById(R.id.firstC);
        Last=(TextView)findViewById(R.id.lastC);

    }
}

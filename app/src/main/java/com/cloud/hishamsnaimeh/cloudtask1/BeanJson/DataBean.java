package com.cloud.hishamsnaimeh.cloudtask1.BeanJson;

import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.ContentBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class DataBean {
    private List<ContentBean> content;
    private int totalPages;
    private int totalElements;
    private boolean last;
    private int numberOfElements;
    private String sort;
    private boolean first;
    private int size;
    private int number;

    public DataBean(JSONObject object) {
        content = new ArrayList<ContentBean>();
        try {
            JSONArray array = new JSONArray(object.getString("content"));
            for (int i = 0; i < array.length(); i++) {
                content.add(new ContentBean(new JSONObject(array.getString(i))));
            }

            totalPages = object.getInt("totalPages");
            totalElements = object.getInt("totalElements");
            last = object.getBoolean("last");
            numberOfElements = object.getInt("numberOfElements");
            sort = object.getString("sort");
            first = object.getBoolean("first");
            size = object.getInt("size");
            number = object.getInt("number");
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

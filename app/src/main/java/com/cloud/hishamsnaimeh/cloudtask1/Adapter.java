package com.cloud.hishamsnaimeh.cloudtask1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cloud.hishamsnaimeh.cloudtask1.BeanJson.ContentBean.ContentBean;
import java.util.List;

/**
 * Created by Hisham Snaimeh on 7/9/2017.
 */

public class Adapter extends BaseAdapter {

    private Activity context;
    private List<ContentBean> list;

    public Adapter(Activity context, List<ContentBean> lists) {
        super();
        this.context = context;
        this.list = lists;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView nameServer, ip_Content, maskContent, mTypeContent, serialContent;
        TextView modelN_content, Date_Content, Expires;
        TextView nameLoc, cityLoc, countryLoc, latitude, longitude;
        TextView valueStatus, nameDanger, valueContent, actionContet;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        LayoutInflater inflater = context.getLayoutInflater();
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.content_row, null);
            holder.nameServer = (TextView) convertView.findViewById(R.id.nameServer);
            holder.ip_Content = (TextView) convertView.findViewById(R.id.ip_Content);
            holder.maskContent = (TextView) convertView.findViewById(R.id.maskContent);
            holder.mTypeContent = (TextView) convertView.findViewById(R.id.mTypeContent);
            holder.serialContent = (TextView) convertView.findViewById(R.id.serialContent);

            holder.modelN_content = (TextView) convertView.findViewById(R.id.modelN_content);
            holder.Date_Content = (TextView) convertView.findViewById(R.id.Date_Content);
            holder.Expires = (TextView) convertView.findViewById(R.id.Expires);

            holder.nameLoc = (TextView) convertView.findViewById(R.id.nameLoc);
            holder.cityLoc = (TextView) convertView.findViewById(R.id.cityLoc);
            holder.countryLoc = (TextView) convertView.findViewById(R.id.countryLoc);
            holder.latitude = (TextView) convertView.findViewById(R.id.latitude);
            holder.longitude = (TextView) convertView.findViewById(R.id.longitude);

            holder.valueStatus = (TextView) convertView.findViewById(R.id.valueStatus);
            holder.nameDanger = (TextView) convertView.findViewById(R.id.nameDanger);
            holder.valueContent = (TextView) convertView.findViewById(R.id.valueContent);
            holder.actionContet = (TextView) convertView.findViewById(R.id.actionContet);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.nameServer.setText(list.get(position).getName());
        holder.ip_Content.setText(list.get(position).getIpAddress());
        holder.maskContent.setText(list.get(position).getDeviceIPSubnetMask().toString());
        if(list.get(position).getType() != null ){
            holder.mTypeContent.setText(list.get(position).getType().getMachineTypeName());
        }
        else
        {holder.mTypeContent.setText("Null");}
        holder.serialContent.setText(list.get(position).getSerialNum());

        holder.modelN_content.setText(list.get(position).getModel().getName());
        holder.Date_Content.setText(list.get(position).getModel().getCreationDate());
        holder.Expires.setText(list.get(position).getModel().getExpiryDate());

        holder.nameLoc.setText(list.get(position).getLocation().getName());
        holder.cityLoc.setText(list.get(position).getLocation().getCity().getName());
        holder.countryLoc.setText(list.get(position).getLocation().getCity().getCountry().getName());
        holder.latitude.setText(Double.toString(list.get(position).getLocation().getLatitude()));
        holder.longitude.setText(Double.toString(list.get(position).getLocation().getLongitude()));

        holder.valueStatus.setText(list.get(position).getStatus().getStatusValue());
        holder.nameDanger.setText(list.get(position).getStatus().getDangerLevel().getDangerLevelName());
        holder.valueContent.setText(Integer.toString(list.get(position).getStatus().getDangerLevel().getDangerLevelIntValue()));
        if (list.get(position).getStatus().getDangerLevel().isActionRequired()) {
            holder.actionContet.setText("true");
        } else {
            holder.actionContet.setText("false");

        }


        return convertView;
    }
}
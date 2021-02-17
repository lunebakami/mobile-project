package com.example.mapproject.custom.adapters;

import android.app.Notification;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mapproject.R;

import java.util.ArrayList;

public class NotificationsAdapter extends ArrayAdapter<Notification> {
    private Context context;
    private ArrayList<Notification> notifications = null;

    public NotificationsAdapter(Context context,  ArrayList<Notification> notif) {
        super(context, 0, notif);
        this.notifications = notif;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Notification notification = notifications.get(position);

        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.item_notifications, null);

        ImageView notificationImage = (ImageView) view.findViewById(R.id.car_image);
        notificationImage.setImageIcon(notification.getLargeIcon());

        TextView notificationName = (TextView) view.findViewById(R.id.car_name);
        notificationName.setText(notification.toString());

        return view;
    }
}

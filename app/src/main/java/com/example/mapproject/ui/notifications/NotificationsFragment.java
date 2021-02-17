package com.example.mapproject.ui.notifications;

import android.app.Notification;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mapproject.R;
import com.example.mapproject.custom.adapters.NotificationsAdapter;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        // Aqui você instancia sua ListView
        ListView notificationsList = (ListView) view.findViewById(R.id.notifications);

        Notification notif1 = new Notification();
        Notification notif2 = new Notification();
        Notification notif3 = new Notification();

        ArrayList<Notification> notifications = new ArrayList<Notification>(); // Obtenha sua lista de objetos aqui

        notifications.add(notif1);
        notifications.add(notif2);
        notifications.add(notif3);

        NotificationsAdapter notificationsAdapter = new NotificationsAdapter(getActivity(), notifications);
        notificationsList.setAdapter(notificationsAdapter);
        return view;
    }
}
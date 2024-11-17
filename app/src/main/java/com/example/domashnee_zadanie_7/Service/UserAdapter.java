package com.example.domashnee_zadanie_7.Service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.domashnee_zadanie_7.Models.User;
import com.example.domashnee_zadanie_7.R;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, List<User> users) {
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_user_item, parent, false);
        }

        User user = getItem(position);

        ImageView avatar = convertView.findViewById(R.id.avatar);
        TextView name = convertView.findViewById(R.id.name);
        TextView location = convertView.findViewById(R.id.location);
        TextView age = convertView.findViewById(R.id.age);

        assert user != null;
        avatar.setImageResource(user.getAvatarResId());
        name.setText(String.format("%s %s", user.getName(), user.getSurname()));
        location.setText(String.format("%s, %s", user.getCity(), user.getCountry()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        age.setText(sdf.format(user.getAge()));

        return convertView;
    }
}

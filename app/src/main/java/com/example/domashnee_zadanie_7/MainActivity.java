package com.example.domashnee_zadanie_7;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.domashnee_zadanie_7.Models.User;
import com.example.domashnee_zadanie_7.Service.UserAdapter;
import com.example.domashnee_zadanie_7.Service.UserGenerator;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.user_list);
        List<User> users = UserGenerator.generateUsers();
        UserAdapter adapter = new UserAdapter(this, users);

        listView.setAdapter(adapter);
    }
}
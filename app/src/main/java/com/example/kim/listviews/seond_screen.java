package com.example.kim.listviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class seond_screen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text=(TextView)findViewById(R.id.view);



        Intent texttext = getIntent();
        String incomingnames=texttext.getStringExtra("name");
        text.setText(incomingnames);
    }
}

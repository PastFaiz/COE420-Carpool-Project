package com.example.rjurri.carpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_date);
    }

    public void selectClick(View view) {
        Intent intent = new Intent(this, SelectTime.class);
        startActivity(intent);
    }
}

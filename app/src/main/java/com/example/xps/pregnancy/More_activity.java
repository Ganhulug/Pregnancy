package com.example.xps.pregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class More_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
    }

    public void openHome(View v)
    {
        Intent i = new Intent(getApplicationContext(), Home_activity.class);
        startActivityForResult(i, 1);
    }

    public void openCalendar(View v)
    {
        Intent i = new Intent(getApplicationContext(), Calendar_activity.class);
        startActivityForResult(i, 1);
    }

    public void openAdvice(View v)
    {
        Intent i = new Intent(getApplicationContext(), Advice_activity.class);
        startActivityForResult(i, 1);
    }

    public void openMore(View v)
    {
        Intent i = new Intent(getApplicationContext(), More_activity.class);
        startActivityForResult(i, 1);
    }
}

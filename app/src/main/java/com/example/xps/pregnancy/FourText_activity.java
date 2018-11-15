package com.example.xps.pregnancy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FourText_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_text_activity);
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

    public void openEej(View v){
        Intent i = new Intent(getApplicationContext(), eej_activity.class);
        startActivityForResult(i, 1);
    }
    public void openJiremsnii_ve(View v){
        Intent i = new Intent(getApplicationContext(), JiremseniiVe_activity.class);
        startActivityForResult(i, 1);
    }
    public void openTwoMonth(View v)
    {
        Intent i = new Intent(getApplicationContext(), HoyrSar_activity.class);
        startActivityForResult(i, 1);
    }
    public void openFourMonth(View v)
    {
        Intent i = new Intent(getApplicationContext(), DorwonSar_activity.class);
        startActivityForResult(i, 1);
    }

    public void openSevenMonth(View v)
    {
        Intent i = new Intent(getApplicationContext(), DoloonSar_activity.class);
        startActivityForResult(i, 1);
    }

    public void openNinthMonth(View v){
        Intent i = new Intent(getApplicationContext(), EsonSar_activity.class);
        startActivityForResult(i, 1);
    }
    public void openOneAge(View v){
        Intent i = new Intent(getApplicationContext(), NegNas_activity.class);
        startActivityForResult(i, 1);
    }
    public void openAsargaa(View v)
    {
        Intent i = new Intent(getApplicationContext(), AsargaaniiZowlogoo_activity.class);
        startActivityForResult(i, 1);
    }
    public void openTwoText(View v)
    {
        Intent i = new Intent(getApplicationContext(), Lesson1_activity.class);
        startActivityForResult(i, 1);
    }
    public void openFourText(View v)
    {
        Intent i = new Intent(getApplicationContext(), FourText_activity.class);
        startActivityForResult(i, 1);
    }
    public void openSevenText(View v)
    {
        Intent i = new Intent(getApplicationContext(), SevenText_activity.class);
        startActivityForResult(i, 1);
    }
    public void openNineText(View v)
    {
        Intent i = new Intent(getApplicationContext(), NineText_activity.class);
        startActivityForResult(i, 1);
    }
}

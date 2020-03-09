package com.example.googlemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WaterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);


}
    public void toWaterActivity(View v){
        Intent intent = new Intent(this, MapActivityWater.class);
        startActivity(intent);
    }
    public void toWaterSafetyPage(View v){
        Intent intent = new Intent(this, WaterSafety.class);
        startActivity(intent);
    }

}

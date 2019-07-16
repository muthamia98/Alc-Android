package com.alc.kennedy.muthamia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openProfile(View v) {
        Intent profile = new Intent(this, ProfileActivity.class);
        startActivity(profile);
    }

    public void openAboutAlc(View v) {
        Intent aboutAlc = new Intent(this, AboutAlcActivity.class);
        startActivity(aboutAlc);
    }
}

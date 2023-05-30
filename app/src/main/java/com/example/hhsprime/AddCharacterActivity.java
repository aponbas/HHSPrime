package com.example.hhsprime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_character);
    }

    public void finish(View view) {
        Intent intent = new Intent();
        intent.putExtra("MESSAGE", "Return bericht");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
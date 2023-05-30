package com.example.hhsprime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_show);
    }

    public void save(View view) {
        System.out.println("Deze button doet iets!");
    }

    public void goToAddCharacterActivity(View view) {
        Intent intent = new Intent(this, AddCharacterActivity.class);
        String characterName = intent.getStringExtra("CHARACTER");
        if (characterName != null && !characterName.isEmpty()) {
            EditText nameET = findViewById(R.id.add_character_name_et_id);
            nameET.setText(characterName);
        }
    }


}

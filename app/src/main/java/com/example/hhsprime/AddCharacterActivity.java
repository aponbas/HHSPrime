package com.example.hhsprime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hhsprime.models.Character;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AddCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_character);
        Intent intent = getIntent();
        String characterName = intent.getStringExtra("CHARACTER");
        if (characterName != null && !characterName.isEmpty()) {
            EditText nameET = findViewById(R.id.add_character_name_et_id);
            nameET.setText(characterName);
        }
    }

    public void finish(View view) {
        Intent intent = new Intent();
        intent.putExtra("MESSAGE", "Return bericht");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void saveCharacter(View view) throws ParseException {
        EditText nameET = findViewById(R.id.add_character_name_et_id);
        EditText dobET = findViewById(R.id.add_character_birthday_et_id);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        String name = nameET.getText().toString();
        Date dateOfBirth = formatter.parse(dobET.getText().toString());
        Character character = new Character(name, dateOfBirth);
        String snackbarMessage = getString(R.string.add_character_success_text);
        Snackbar mySnackbar = Snackbar.make(view, snackbarMessage, BaseTransientBottomBar.LENGTH_SHORT);
        mySnackbar.show();
    }
}
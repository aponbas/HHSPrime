package com.example.hhsprime;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hhsprime.models.Show;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class AddShowActivity extends AppCompatActivity {

    private ActivityResultLauncher<Intent> launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_show);
        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    System.out.println(result.getData().getStringExtra("MESSAGE"));
                });
    }

    public void save(View view) {
        EditText nameET = findViewById(R.id.main_name_et_id);
        EditText seasonsET = findViewById(R.id.main_seasons_et_id);

        String name = nameET.getText().toString();
        int seasons = Integer.parseInt(seasonsET.getText().toString());

        Show show = new Show(name, seasons);

        String snackbarMessage = getString(R.string.add_show_success_text);
        Snackbar mySnackbar = Snackbar.make(view, snackbarMessage, BaseTransientBottomBar.LENGTH_SHORT);
        mySnackbar.show();
    }

    public void goToAddCharacterActivity(View view) {
        Intent intent = new Intent(this, AddCharacterActivity.class);
        String characterName = "Vincent Chase";
        intent.putExtra("CHARACTER", characterName);
        launcher.launch(intent);
    }
}

package com.example.inclassassignment07_yueg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class InfoInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_input);
    }

    public void submitAnimal (View view){
        EditText name = findViewById(R.id.animal_name);
        String animalName = name.getText().toString();

        EditText leg = findViewById(R.id.leg_number);
        int numberOfLegs = Integer.parseInt(leg.getText().toString());

        CheckBox fur = findViewById(R.id.has_fur);
        boolean hasFur = fur.isChecked();

        EditText info = findViewById(R.id.additional_info);
        String addInfo = info.getText().toString();

        Animal animal = new Animal (animalName,numberOfLegs,hasFur,addInfo);
        Intent data = new Intent();
        data.putExtra(Keys.ANIMAL, animal);
        setResult(RESULT_OK, data);
        finish();
    }
}
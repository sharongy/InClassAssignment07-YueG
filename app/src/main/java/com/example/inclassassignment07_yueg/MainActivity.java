package com.example.inclassassignment07_yueg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView infoDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addAnimal(View view) {
        Intent intent = new Intent(this, InfoInput.class);
        startActivityForResult(intent, Keys.REQUEST_ADD_ANIMAL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        infoDisplay = findViewById(R.id.info_display);
        if (requestCode == Keys.REQUEST_ADD_ANIMAL && resultCode == RESULT_OK) {
            Animal animal = (Animal) data.getSerializableExtra(Keys.ANIMAL);
            String previousAnimal;
            previousAnimal = infoDisplay.getText().toString();
            infoDisplay.setText(previousAnimal + "\n" + animal.toString() + "\n");
        }
    }
}


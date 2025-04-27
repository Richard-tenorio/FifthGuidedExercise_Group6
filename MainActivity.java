package com.example.fifthguidedexercise;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton red, blue, yellow, green;
    LinearLayout layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout_root);
        red = findViewById(R.id.rbRed);
        blue = findViewById(R.id.rbBlue);
        yellow = findViewById(R.id.rbYellow);
        green = findViewById(R.id.rbGreen);
    }

    public void showSelectedColor() {
        if (red.isChecked()) {
            Toast.makeText(this, "Color: RED", Toast.LENGTH_SHORT).show();
        } else if (blue.isChecked()) {
            Toast.makeText(this, "Color: BLUE", Toast.LENGTH_SHORT).show();
        } else if (yellow.isChecked()) {
            Toast.makeText(this, "Color: YELLOW", Toast.LENGTH_SHORT).show();
        } else if (green.isChecked()) {
            Toast.makeText(this, "Color: GREEN", Toast.LENGTH_SHORT).show();
        }
    }

    public void changeBackgroundColor(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) {
            int viewId = view.getId();

            if (viewId == R.id.rbRed) {
                layout.setBackgroundColor(Color.RED);
            } else if (viewId == R.id.rbBlue) {
                layout.setBackgroundColor(Color.BLUE);
            } else if (viewId == R.id.rbYellow) {
                layout.setBackgroundColor(Color.YELLOW);
            } else if (viewId == R.id.rbGreen) {
                layout.setBackgroundColor(Color.GREEN);
            }

            showSelectedColor();
        }
    }
}

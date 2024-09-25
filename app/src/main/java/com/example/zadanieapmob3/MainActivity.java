package com.example.zadanieapmob3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {


    TextView textView;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                napiszCos();
                pokazToast();
            }
        });
    }


    public void napiszCos() {
        //DO ZADANIA2
        //textView.setText("Witaj, świecie!");
        textView.setText(getString(R.string.Zadanie3));
    }
    public void pokazToast() {
        Toast.makeText(getApplicationContext(), "Kliknięto przycisk", Toast.LENGTH_SHORT).show();
    }
}

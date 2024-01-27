package com.example.preparation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        Spinner spin = findViewById(R.id.spin);
        EditText name = findViewById(R.id.userName);
        EditText pass = findViewById(R.id.password);

        List<String> spinnerItems = new ArrayList<>();
        spinnerItems.add("sf");
        spinnerItems.add("rf");
        spinnerItems.add("nf");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerItems);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

    }
    public void disable(View v){
        v.setEnabled(false);
        Button b =(Button) v;
        b.setText("clicked");
    }
}

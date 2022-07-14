package com.example.minipro1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class gifk extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifk);

        radioGroup = findViewById(R.id.Rgroup);
        editText= findViewById(R.id.panju);

        Button buttonsubmit = findViewById(R.id.FSUBMIT);
        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    public void lallu(View view) {
        int rid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(rid);
        Toast.makeText(this,"Successfully Selected " + radioButton.getText(),Toast.LENGTH_SHORT).show();
    }
}
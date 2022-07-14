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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class gifk extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editText;

    FirebaseDatabase database;
    DatabaseReference reference;
    int rid;
    String subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifk);

        radioGroup = findViewById(R.id.Rgroup);
        editText= findViewById(R.id.panju);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();



        Button buttonsubmit = findViewById(R.id.FSUBMIT);
        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String feedback = editText.getText().toString();
                reference.child("Feedback").child("feedback").child("subject").setValue(subject);
                reference.child("Feedback").child("feedback").child("feed").setValue(feedback );
            }
        });

    }
    public void lallu(View view) {
        rid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(rid);
        subject = radioButton.getText().toString();
        Toast.makeText(this,"Successfully Selected " + radioButton.getText(),Toast.LENGTH_SHORT).show();
    }
}
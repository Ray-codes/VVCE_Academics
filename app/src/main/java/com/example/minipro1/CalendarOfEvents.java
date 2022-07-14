package com.example.minipro1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalendarOfEvents extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_of_events);
        tv1 = findViewById(R.id.events);
    }

    public void jan(View view) {
        tv1.setText("Mon, 4th : Commencement of Even Semester\n" +
                "Tue 5th : First CR's meeting\n" +
                "Sat 23rd : Early feedback");
    }

    public void feb(View view) {
        tv1.setText("Mon, 7th : Commencement of odd Semester\n" +
                "Tue 8th : Vidyuth\n" +
                "Sat 25rd : Teachers feedback");
    }

    public void mar(View view) {
        tv1.setText("Mon, 4th : Commencement of Even Semester\n" +
                "Tue 5th : IA-1\n" +
                "Sat 23rd : Students performance assessment");
    }

    public void apr(View view) {
        tv1.setText("Mon, 4th : Commencement of odd Semester\n" +
                "Tue 5th : Placement Training\n" +
                "Sat 23rd : Cam Meeting-1");
    }

    public void may(View view) {
        tv1.setText("Mon, 4th : Commencement of Even Semester\n" +
                "Tue 5th : Lab IA-1\n" +
                "Sat 23rd : Ethnic Day");
    }

    public void jun(View view) {
        tv1.setText("Mon, 4th : Commencement of odd Semester\n" +
                "Tue 5th : IA-2\n" +
                "Sat 23rd : Picnic Day");
    }

    public void jul(View view) {
        tv1.setText("Mon, 4th : Commencement of Even Semester\n" +
                "Tue 5th : Lab IA-2\n" +
                "Sat 23rd : CAM Meeting-2");
    }

    public void aug(View view) {
        tv1.setText("Mon, 4th : Commencement of odd Semester\n" +
                "Tue 5th : Industrial Visit\n" +
                "Sat 23rd : Early feedback");
    }

    public void sep(View view) {
        tv1.setText("Mon, 4th : Commencement of Even Semester\n" +
                "Tue 5th : IA-3\n" +
                "Sat 23rd : Sem End Feedback");
    }

    public void oct(View view) {
        tv1.setText("Mon, 2nd : Commencement of odd Semester\n" +
                "Tue 5th : Project Finalisation\n" +
                "Sat 28th : Internship Meet");
    }

    public void nov(View view) {
        tv1.setText("Mon, 4th : Commencement of Even Semester\n" +
                "Tue 7th : Replacement test\n" +
                "Sat 23rd : Student performance assessment-2");
    }

    public void dec(View view) {
        tv1.setText("Mon, 4th : Commencement of odd Semester\n" +
                "Tue 9th : Replacement test for those who broke no nut noverber\n" +
                "Sat 29th : Externals");
    }
}
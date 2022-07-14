package com.example.minipro1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.Authenticator;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText emaileditText,passwordeditText;
    Button button;
    Button signInBtn;

    FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emaileditText=findViewById(R.id.emaileditText); // value fetching
        passwordeditText=findViewById(R.id.passwordeditText); //value fetching from activity xml
        button=findViewById(R.id.button);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();
    }

    public void Signup(View view) {
        String email=emaileditText.getText().toString();
        String password=passwordeditText.getText().toString();
        if(!email.equals("") && !password.equals("")){
            signup(email,password);
        }


        Intent intent=new Intent(MainActivity.this,LoginActivity.class); // arguments go with the activities which are to be interactive
        intent.putExtra("email",email);
        intent.putExtra("password",password);  //transfer data from one activity to another instead of database
        startActivity(intent);


    }

    public void signIn(View view) {
        String email=emaileditText.getText().toString();
        String password=passwordeditText.getText().toString();
        if(!email.equals("") && !password.equals("")){
            signing(email,password);
        }
        else{
            Toast.makeText(MainActivity.this, "Enter Email and Password", Toast.LENGTH_LONG).show();
        }


    }
    // next function....
    public void signing(String email,String password){
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent=new Intent(MainActivity.this,studentapp.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Sign in unsuccessful", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void signup(String email,String password){
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    reference.child("Users").child(auth.getUid()).child("email").setValue(email);
                    Intent intent=new Intent(MainActivity.this,studentapp.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "There is a Problem", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
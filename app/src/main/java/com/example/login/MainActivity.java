package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText name,pwd;
private TextView view;
private Button login;
int count=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        pwd=findViewById(R.id.pwd);
        view=findViewById(R.id.textView);
        login=findViewById(R.id.button);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String n=name.getText().toString();
            String p=pwd.getText().toString();
            if((n=="Admin") && (p=="1234"))
            {
                Intent intent=new Intent(MainActivity.this,SeconActivity.class);
                startActivity(intent);
            }
            else
            {
            count--;
            if(count==0)
            {
                login.setEnabled(false);
            }

            }
        }
    });
    }

}

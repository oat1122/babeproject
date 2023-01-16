package com.example.nutoat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void PageView(View view){
        Button btnView = (Button) findViewById(R.id.btnTra);
        Intent intent = new Intent(home.this,travel.class);
        startActivity(intent);
    }

    public void OTPView(View view){
        Button btnView = (Button) findViewById(R.id.btnOTOP);
        Intent intent = new Intent(home.this,otop.class);
        startActivity(intent);
    }

    public void LoginPage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(home.this,MainActivity.class);
        startActivity(intent);
    }
}

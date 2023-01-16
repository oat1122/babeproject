package com.example.nutoat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otop3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otop3);
    }
    public void BackPage(View view){
        Button btnBack = (Button) findViewById(R.id.btnBACK);
        Intent intent = new Intent(otop3.this,otop2.class);
        startActivity(intent);
    }
    public void HomePage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(otop3.this,home.class);
        startActivity(intent);
    }
    public void NextPage(View view){
        Button btnNEXT = (Button) findViewById(R.id.btnNEXT);
        Intent intent = new Intent(otop3.this,otop2.class);
        startActivity(intent);
    }
}
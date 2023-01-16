package com.example.nutoat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class travel2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel2);
    }
    public void BackPage(View view){
        Button btnBack = (Button) findViewById(R.id.btnBACK);
        Intent intent = new Intent(travel2.this,travel.class);
        startActivity(intent);
    }
    public void HomePage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHOME);
        Intent intent = new Intent(travel2.this,home.class);
        startActivity(intent);
    }
    public void NextPage(View view){
        Button btnNEXT = (Button) findViewById(R.id.btnNEXT);
        Intent intent = new Intent(travel2.this,travel2.class);
        startActivity(intent);
    }
}

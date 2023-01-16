package com.example.nutoat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myme extends AppCompatActivity {
    Button FB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myme);
        FB = findViewById(R.id.FB);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/oat.oat.3597?mibextid=ZbWKwL");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    public void HomePage(View view){
        Button btnHOME = (Button) findViewById(R.id.btnHME);
        Intent intent = new Intent(myme.this,MainActivity.class);
        startActivity(intent);
    }
}


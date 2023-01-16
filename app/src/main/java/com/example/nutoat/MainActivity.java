package com.example.nutoat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button FB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try (DbHelper db = new DbHelper(this)) {

            EditText data_Stuid = findViewById(R.id.edtName);
            Button loginbtn = findViewById(R.id.btnOK);

            loginbtn.setOnClickListener(v -> {
                String data_name_str = data_Stuid.getText().toString();


                if (data_name_str.equalsIgnoreCase("")) {
                    data_Stuid.setError("Please enter a Username");

                } else {
                    db.addVisitor(new Visitor(data_name_str, Utility.get_ts()));
                    data_Stuid.setText("");
                    Intent intent = new Intent(this, home.class);
                    startActivity(intent);
                }
            });
        }
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

    public void MainPage(View view){
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Intent intent = new Intent(MainActivity.this,home.class);
        startActivity(intent);
    }
    public void CallPage(View view){
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Intent intent = new Intent(MainActivity.this,myme.class);
        startActivity(intent);
    }
}
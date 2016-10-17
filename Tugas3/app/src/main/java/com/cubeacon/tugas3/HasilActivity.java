package com.cubeacon.tugas3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    Button btnLogout;
    Button btnBack;
    SessionManager session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnBack = (Button) findViewById(R.id.btnBack);
        TextView nim1 = (TextView) findViewById(R.id.nim);
        TextView nama1 = (TextView) findViewById(R.id.nama);

        SharedPreferences pref =
                getApplicationContext().getSharedPreferences("MyPref", 0);
       String nim =pref.getString("key_nim",null);
       String nama=pref.getString("key_nama",null);
        nim1.setText(""+nim);
        nama1.setText(""+nama);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                session.logoutUser();
                finish();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }


}

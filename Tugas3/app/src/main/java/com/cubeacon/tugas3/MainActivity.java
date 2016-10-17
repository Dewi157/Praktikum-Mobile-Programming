package com.cubeacon.tugas3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    SessionManager session;
    EditText nim1;
    EditText nama1;
    Button btnLogout;
    Button simpan;
    Button hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        session = new SessionManager(getApplicationContext());
        nim1 = (EditText) findViewById(R.id.nim);
        nama1 = (EditText) findViewById(R.id.nama);
        TextView lblName = (TextView) findViewById(R.id.lblNama);
        TextView lblEmail = (TextView) findViewById(R.id.lblEmail);
        // Button logout
        btnLogout = (Button) findViewById(R.id.btnLogout);
        simpan = (Button) findViewById(R.id.simpan);
        hasil = (Button) findViewById(R.id.hasil);
        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();

        // Cek User apakah sudah login
        session.checkLogin();

        // Mendapatkan data user dari session
        HashMap<String, String> user = session.getUserDetails();
        // nama
        String name = user.get(SessionManager.KEY_NAME);

        // email
        String email = user.get(SessionManager.KEY_EMAIL);

        // menampilkan user data
        lblName.setText(Html.fromHtml(""+ name + "</b>"));
        lblEmail.setText(Html.fromHtml("" + email + "</b>"));

        /**
         *	Logout button click event
         *	*/
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // menghapus session data
                // dan mengarahakan ke LoginActivity
                         session.logoutUser();
                           finish();
            }
        });

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String nim =nim1.getText().toString();
                String nama=nama1.getText().toString();
                SharedPreferences pref =
                        getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("key_nim", nim);
                editor.putString("key_nama", nama);
                editor.commit();

            }
        });
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent  intent = new Intent(getApplicationContext(), HasilActivity.class);
                startActivity(intent);
            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // menghapus session data
                // dan mengarahakan ke LoginActivity
                session.logoutUser();
                finish();
            }
        });
    }
}


package com.cubeacon.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent =getIntent();
        Bundle bundle = intent.getExtras();
        String data_nim =bundle.getString("nim_mhs");
        String data_nama=bundle.getString("nama_mhs");
        String data_pass=bundle.getString("pass_mhs");
        String data_jurusan=bundle.getString("jurusan_mhs");
        String data_matkul=bundle.getString("matkul_mhs");
        TextView nim= (TextView)findViewById(R.id.nim);
        TextView nama= (TextView)findViewById(R.id.nama);
        TextView pass= (TextView)findViewById(R.id.pass);
        TextView jurusan= (TextView)findViewById(R.id.jurusan);
        TextView matkul=(TextView)findViewById(R.id.matkul);
        nim.setText(""+data_nim);
        nama.setText(""+data_nama);
        pass.setText(""+data_pass);
        jurusan.setText(""+data_jurusan);
        matkul.setText(""+data_matkul);

    }
    public void login(View view){
        Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(i);

    }
}

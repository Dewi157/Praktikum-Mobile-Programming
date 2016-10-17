package com.cubeacon.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText nim;
    EditText nama;
    EditText pass;
    EditText jurusan;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nim=(EditText)findViewById(R.id.editnim);
        nama=(EditText)findViewById(R.id.editnama);
        pass=(EditText)findViewById(R.id.editpass);
        jurusan=(EditText)findViewById(R.id.editjurusan);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
        cb3=(CheckBox)findViewById(R.id.cb3);
    }
    public void balik(View view){
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
    public void register(View view){
       String nim1=nim.getText().toString();
       String nama1=nama.getText().toString();
       String pass1=pass.getText().toString();
       String jurusan1=jurusan.getText().toString();
       String a="";
        if(cb1.isChecked()){
            a="Bahasa Java\n";

        }
        if(cb2.isChecked()){
            a="Bahasa PHP\n";

        }
        if(cb3.isChecked()){
            a="Bahasa C++\n";

        }
       Intent intent= new Intent(getApplicationContext(),ResultActivity.class);
       intent.putExtra("nim_mhs",nim1);
       intent.putExtra("nama_mhs",nama1);
       intent.putExtra("pass_mhs",pass1);
       intent.putExtra("jurusan_mhs",jurusan1);
       intent.putExtra("matkul_mhs",a);
       startActivity(intent);

    }
}

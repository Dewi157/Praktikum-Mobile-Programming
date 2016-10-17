package praktikummobpro.com.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userInputnama ;
    EditText userInputemail ;
    EditText userInputnim ;
    EditText userInputangkatan;
    TextView a;
    TextView b;
    TextView c;
    TextView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInputnama = (EditText)findViewById(R.id.enama);
        userInputemail = (EditText)findViewById(R.id.eemail);
        userInputnim = (EditText)findViewById(R.id.enim);
        userInputangkatan = (EditText)findViewById(R.id.eangkatan);
        a = (TextView)findViewById(R.id.a);
        b = (TextView)findViewById(R.id.b);
        c = (TextView)findViewById(R.id.c);
        d = (TextView)findViewById(R.id.d);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
    }

    public void tampil(View view){
        userInputnama.setVisibility(View.GONE);
        userInputemail.setVisibility(View.GONE);
        userInputnim.setVisibility(View.GONE);
        userInputangkatan.setVisibility(View.GONE);
        a.setText(userInputnama.getText().toString());
        b.setText(userInputemail.getText().toString());
        c.setText(userInputnim.getText().toString());
        d.setText(userInputangkatan.getText().toString());
        a.setVisibility(View.VISIBLE);
        b.setVisibility(View.VISIBLE);
        c.setVisibility(View.VISIBLE);
        d.setVisibility(View.VISIBLE);

    }
}

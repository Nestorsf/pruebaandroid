package com.example.nestorso.pruebasandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(getClass().getName(), "FS-01");
        Toast.makeText(this,"Hola Fox", Toast.LENGTH_LONG).show();
    }
}

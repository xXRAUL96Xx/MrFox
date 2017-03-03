package com.example.raul.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView tvTitulo, tvSubtitulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvTitulo = (TextView) findViewById(R.id.Titulo);
        tvSubtitulo = (TextView) findViewById(R.id.subtitulo);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "font/AmaticSC-Regular.ttf");
        tvTitulo.setTypeface(myFont);
        tvSubtitulo.setTypeface(myFont);
    }
    public void principal (View view){
        Intent i = new Intent(getBaseContext(),ScrollingActivity.class);
        startActivity(i);
    }
}

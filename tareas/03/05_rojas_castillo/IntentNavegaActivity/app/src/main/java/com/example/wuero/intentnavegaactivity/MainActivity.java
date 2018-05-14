package com.example.wuero.intentnavegaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btn,btn2;
    Intent browserIntent,actividad2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }
    public void iniciar()
    {
        btn=(Button)findViewById(R.id.btnNavegador);
        btn.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.btnActividad);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.btnNavegador:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(browserIntent);
            break;
            case R.id.btnActividad:
                actividad2 = new Intent(this,Activity2.class);
                startActivity(actividad2);
                break;
        }
    }
}
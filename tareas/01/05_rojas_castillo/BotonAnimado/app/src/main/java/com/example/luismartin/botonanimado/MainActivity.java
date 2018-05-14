package com.example.luismartin.botonanimado;

import android.graphics.drawable.AnimationDrawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewAnimator;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity
{
    private ImageView img;
    Button PREV, NEXT, DELET;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.img);
        NEXT=(Button)findViewById(R.id.NEXT);
        NEXT.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                img.post(new Runnable()
                {
                    @Override
                    public void run() {((AnimationDrawable) img.getBackground()).start();}
                });
            }
        });

    }
}

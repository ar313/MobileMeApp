package com.ahmed.mobilemeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PresentationActivity extends AppCompatActivity
{

    private Button backBtn,nextBtn;
    public static void newInstance(Context context)
    {
        Intent intent = new Intent(context, PresentationActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentation_screen);


        backBtn=findViewById(R.id.back);
            backBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    finish();
                }
            });

        nextBtn=findViewById(R.id.button);
                nextBtn.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        LastScreen();
                    }
                });

    }

    private void LastScreen()
    {
        MotivationActivity.newInstance(this);
    }
}
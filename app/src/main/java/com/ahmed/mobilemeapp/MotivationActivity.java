package com.ahmed.mobilemeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MotivationActivity extends AppCompatActivity
{

        private Button back;
        public static void newInstance(Context context)
        {
                Intent intent = new Intent(context, MotivationActivity.class);
                context.startActivity(intent);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.motivation_activity);

                back=findViewById(R.id.back);
                back.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        finish();
                    }
                 });
        }
}
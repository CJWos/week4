package com.example.app0316;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView4;
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView4 = findViewById(R.id.imageView4);
        imageView3 = findViewById(R.id.imageView3);

    }

    public void onbut(View v)
    {
        imageView3.setImageResource(0);
        imageView4.setImageResource(R.drawable.image01);
    }
    public void onbut2(View v){
        imageView4.setImageResource(0);
        imageView3.setImageResource(R.drawable.image01);
    }
}
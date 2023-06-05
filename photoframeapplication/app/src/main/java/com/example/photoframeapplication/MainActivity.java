package com.example.photoframeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int imgArr[] = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5};
    int i = 0;
    public void nextImg(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView5);
        if(i==4)
        {
            i=0;
            img.setImageResource(imgArr[i]);
        }
        else
        {
            i++;
            img.setImageResource(imgArr[i]);
        }
    }
    public void prevImg(View view){
        ImageView img = (ImageView) findViewById(R.id.imageView5);
        if(i==0)
        {
            i=4;
            img.setImageResource(imgArr[i]);
        }
        else
        {
            i--;
            img.setImageResource(imgArr[i]);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
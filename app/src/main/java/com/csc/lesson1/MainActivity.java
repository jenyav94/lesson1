package com.csc.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            Picasso.with(MainActivity.this)
                    .load("https://pp.vk.me/c319717/v319717185/1e5b/jLNXWStC0j8.jpg")
                    .into(imageView);

    }
}

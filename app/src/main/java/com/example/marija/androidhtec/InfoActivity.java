package com.example.marija.androidhtec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView imageView=(ImageView)findViewById(R.id.image);
        TextView titleView=(TextView) findViewById(R.id.title);
        TextView descriptionView=(TextView) findViewById(R.id.description);

        Intent intent = getIntent();
        String image = intent.getStringExtra("image");
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");

        Glide.with(InfoActivity.this).load(image).into(imageView);
        titleView.setText(title);
        descriptionView.setText(description);


    }
}

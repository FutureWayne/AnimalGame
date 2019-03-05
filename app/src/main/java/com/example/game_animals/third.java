package com.example.game_animals;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class third extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView imageView_1 = (ImageView)this.findViewById(R.id.imageView1);
        ImageView imageView_2 = (ImageView)this.findViewById(R.id.imageView2);
        ImageView imageView_3 = (ImageView)this.findViewById(R.id.imageView3);
        ImageView imageView_4 = (ImageView)this.findViewById(R.id.imageView4);

        imageView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(third.this,fifth.class);
                startActivity(newActivity);
            }
        });

        imageView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(third.this,fifth.class);
                startActivity(newActivity);
            }
        });

        imageView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(third.this,fifth.class);
                startActivity(newActivity);
            }
        });

        imageView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(third.this,forth.class);
                startActivity(newActivity);
            }
        });

        TextView title=(TextView)this.findViewById(R.id.textView);
        Typeface type=Typeface.createFromAsset(getAssets(),"04B_03.TTF");
        title.setTypeface(type);
    }
}

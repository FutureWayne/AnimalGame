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

public class second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView_1 = (ImageView)this.findViewById(R.id.imageView1);
        ImageView imageView_2 = (ImageView)this.findViewById(R.id.imageView2);

        imageView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(second.this,third.class);
                startActivity(newActivity);
            }
        });

        imageView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(second.this,fifth.class);
                startActivity(newActivity);
            }
        });

        TextView title=(TextView)this.findViewById(R.id.textView);
        Typeface type=Typeface.createFromAsset(getAssets(),"04B_03.TTF");
        title.setTypeface(type);

    }
}

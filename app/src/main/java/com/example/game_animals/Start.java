package com.example.game_animals;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button btn_1=(Button)findViewById(R.id.btn1);
        Button btn_2=(Button)findViewById(R.id.btn2);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity=new Intent(Start.this,second.class);
                startActivity(secondActivity);
            }
        });
        TextView title=(TextView)this.findViewById(R.id.title1);
        Typeface type=Typeface.createFromAsset(getAssets(),"04B_03.TTF");
        title.setTypeface(type);
        btn_1.setTypeface(type);
        btn_2.setTypeface(type);
    }
    public void onClick(View v){

    }
}

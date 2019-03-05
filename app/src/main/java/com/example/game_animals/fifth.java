package com.example.game_animals;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Button btnMain=(Button)this.findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fifth.this,Start.class);
                startActivity(intent);
            }
        });

        TextView title=(TextView)this.findViewById(R.id.textView);
        Typeface type=Typeface.createFromAsset(getAssets(),"04B_03.TTF");
        title.setTypeface(type);
        btnMain.setTypeface(type);


    }
}

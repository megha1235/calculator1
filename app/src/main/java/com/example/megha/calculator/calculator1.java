package com.example.megha.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calculator1 extends AppCompatActivity {
Button a,b,c,d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator1);
        a=(Button)findViewById(R.id.add);
        b=(Button)findViewById(R.id.sub);
        c=(Button)findViewById(R.id.mult);
        d=(Button)findViewById(R.id.div);
        e=(Button)findViewById(R.id.fl) ;
        f=(Button)findViewById(R.id.fs);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent la=new Intent(getApplicationContext(),large.class);
                startActivity(la);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d= new Intent(getApplicationContext(),small.class);
                startActivity(d);

            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent di= new Intent(getApplicationContext(),div.class);
                startActivity(di);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mult=new Intent(getApplicationContext(),mult.class);
                startActivity(mult);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),sub.class);
                startActivity(i);

            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),add.class);
                startActivity(i);

            }
        });






    }
}


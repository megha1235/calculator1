package com.example.megha.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add extends AppCompatActivity {
EditText e1,e2,e3,e4;
    Button b1,b2;
    String s1,s2,s3,s4;
    Integer n1,n2,n3,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        e1=(EditText)findViewById(R.id.result);
        e2=(EditText)findViewById(R.id.n1);
        e3=(EditText)findViewById(R.id.n2);
        e4=(EditText)findViewById(R.id.n3);
        b1=(Button)findViewById(R.id.ad);
        b2=(Button)findViewById(R.id.bc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e2.getText().toString();
                s2=e3.getText().toString();
                s3=e4.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                n3=Integer.parseInt(s3);
                sum=n1+n2+n3;
                s4=String.valueOf(sum);
                //e1.setText(sum);
               // e1.setVisibility( View.VISIBLE);
                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f=new Intent(getApplicationContext(),calculator1.class);
                startActivity(f);
            }
        });



    }
}

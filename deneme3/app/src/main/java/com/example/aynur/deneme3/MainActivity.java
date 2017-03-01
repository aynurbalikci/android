package com.example.aynur.deneme3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view){
        double register=10.0;
        register =register +5;
        register =register -2.5;
        register =register +10;
        register =register -3;
        System.out.println(register);
        System.out.println(2.0 * (5/2));
//        TextView tvResult =(TextView) findViewById(R.id.tvResult);
//        tvResult.setText(register);

    }
}

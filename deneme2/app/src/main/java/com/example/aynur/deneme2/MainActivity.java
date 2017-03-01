package com.example.aynur.deneme2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view){
        EditText etName= (EditText) findViewById(R.id.etName);
        String name= etName.getText().toString();

        EditText etSurname=(EditText) findViewById(R.id.etSurname);
        String surname= etSurname.getText().toString();

        TextView tvResult= (TextView) findViewById(R.id.tvResult);


        tvResult.setText(name+ "\n" +surname);
    }
}

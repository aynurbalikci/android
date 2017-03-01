package com.example.aynur.deneme;

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

        EditText etSurname= (EditText) findViewById(R.id.etSurname);
        String surname= etSurname.getText().toString();

        TextView tvResult= (TextView) findViewById(R.id.tvResult);
        name= name.trim();

        if(name.indexOf("")!=-1){
            int emptyPlace = name.indexOf(" ");
            String name0[] = name.split(" ");

            int esitMi = name0[0].compareTo(name0[1]);

                if(esitMi>0){
                   name= name0[1]+" " +name0[0].substring(0,1)+ ".";
                   tvResult.setText(name);
                 }
                if(esitMi<0){
                    name= name0[0]+ " " +name0[1].substring(0,1)+".";
                }
      }

        tvResult.setText(name+" "+surname);
    }
}

package com.example.aynur.hesapmakinesi;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText etSayi1;
    EditText etSayi2;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSayi1= (EditText) findViewById(R.id.etSayi1);
        etSayi2=(EditText) findViewById(R.id.etSayi2);

        tvResult =(TextView)findViewById(R.id.tvResult);
    }
    public void toplama(View view){
        String sayi1= etSayi1.getText().toString();
        String sayi2= etSayi2.getText().toString();
        int sonuc=  Integer.parseInt(sayi1)+Integer.parseInt(sayi2);

        tvResult.setText(String.valueOf(sonuc));

    }
    public void cikarma(View view){
        String sayi1= etSayi1.getText().toString();
        String sayi2= etSayi2.getText().toString();

        int sonuc=  Integer.parseInt(sayi1)-Integer.parseInt(sayi2);

        tvResult.setText(String.valueOf(sonuc));
    }
    public void mod(View view){
        String sayi1= etSayi1.getText().toString();
        String sayi2= etSayi2.getText().toString();

        int sonuc=  Integer.parseInt(sayi1)%Integer.parseInt(sayi2);

        tvResult.setText(String.valueOf(sonuc));


    }
    public void carpma(View view){

        String sayi1= etSayi1.getText().toString();
        String sayi2= etSayi2.getText().toString();

        int sonuc=  Integer.parseInt(sayi1)*Integer.parseInt(sayi2);

        tvResult.setText(String.valueOf(sonuc));

    }
    public void bolme(View view){
        String sayi1= etSayi1.getText().toString();
        String sayi2= etSayi2.getText().toString();

        double sonuc= (double) Integer.parseInt(sayi1)/Integer.parseInt(sayi2);

        tvResult.setText(String.valueOf(sonuc));


    }
}

package com.example.mert.toplamaprojesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benimcalismam);
    }

    public void onButtonClick(View v){

        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        int sayi1 = Integer.parseInt(e1.getText().toString());
        int sayi2 = Integer.parseInt(e2.getText().toString());
        int toplam = sayi1+sayi2;
        t1.setText(Integer.toString(toplam));




    }
}

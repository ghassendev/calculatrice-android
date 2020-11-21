package com.example.mytuto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sum;
    TextView result;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //setContentView(R.layout.newayout);
        sum=findViewById(R.id.sum);
        num1=findViewById(R.id.number1);
        num2=findViewById(R.id.number2);
        result=findViewById(R.id.result);




    }
  /*  public void ClickMe (View view){
        textView.setBackgroundColor(Color.BLACK);
        textView.setTextColor(Color.GREEN);
        textView.setText(R.string.click);


    }*/
  public void ClickSum (View view){
    double number1=Double.parseDouble(num1.getText().toString());
    double number2=Double.parseDouble(num2.getText().toString());
    result.setBackgroundColor(Color.BLACK);
    result.setTextColor(Color.RED);
    result.setText(""+(number1+number2));
  }





}


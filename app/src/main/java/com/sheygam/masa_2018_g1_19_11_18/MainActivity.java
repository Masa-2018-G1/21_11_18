package com.sheygam.masa_2018_g1_19_11_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView myTxt;
    private String operand;
    private int oper = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_calc);

        Button oneBtn = findViewById(R.id.one_btn);
        Button twoBtn = findViewById(R.id.two_btn);
        Button plusBtn = findViewById(R.id.plus_btn);
        Button cancelBtn = findViewById(R.id.cancel_btn);
        Button equalsBtn = findViewById(R.id.equals_btn);
        Button ceBtn = findViewById(R.id.ce_btn);
        myTxt = findViewById(R.id.my_txt);

        oneBtn.setOnClickListener(this);
        twoBtn.setOnClickListener(this);
        plusBtn.setOnClickListener(this);
        equalsBtn.setOnClickListener(this);
        cancelBtn.setOnClickListener(this);
        ceBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.one_btn) {
            myTxt.setText(myTxt.getText().toString() + 1);
        }else if(v.getId() == R.id.two_btn){
            myTxt.setText(myTxt.getText().toString() + 2);
        }else if(v.getId() == R.id.equals_btn){
            int a = Integer.parseInt(operand);
            int b = Integer.parseInt(myTxt.getText().toString());
            if(oper == 1){
                myTxt.setText((a + b)+"");
            }
            oper = -1;
            operand = null;
        }else if(v.getId() == R.id.cancel_btn){
            operand = null;
            oper = -1;
            myTxt.setText("");
        }else if(v.getId() == R.id.plus_btn){
            oper = 1;
            operand = String.valueOf(myTxt.getText());
            myTxt.setText("");
        }else if(v.getId() == R.id.ce_btn){
            if(myTxt.getHint().toString().isEmpty()){
                myTxt.setHint("0");
            }else {
                myTxt.setHint("");
                myTxt.setText("");
                operand = null;
                oper = -1;
            }
        }
    }
}

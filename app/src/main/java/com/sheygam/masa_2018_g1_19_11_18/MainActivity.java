package com.sheygam.masa_2018_g1_19_11_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView myTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_calc);

        Button oneBtn = findViewById(R.id.one_btn);
        Button twoBtn = findViewById(R.id.two_btn);
        myTxt = findViewById(R.id.my_txt);

        oneBtn.setOnClickListener(this);
        twoBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.one_btn) {
//            Toast.makeText(this, "MyBtn click", Toast.LENGTH_SHORT).show();
            String str = String.valueOf(myTxt.getText());
            str += "1";
            myTxt.setText(str);
//            int res = 1+1;
//            myTxt.setText(String.valueOf(res));

        }else if(v.getId() == R.id.two_btn){
//            Toast.makeText(this, "Second btn clicked!", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etPrinciple, etTime, etRate;
    Button btnSimpleInterest;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        etPrinciple=findViewById(R.id.etPrinciple);
        etTime=findViewById(R.id.etTime);
        etRate=findViewById(R.id.etRate);
        btnSimpleInterest=findViewById(R.id.btnSimpleInterest);
        tvResult=findViewById(R.id.tvResult);

        //setting click listener in button
        btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(etPrinciple.getText())){
                    etPrinciple.setError("Principle Amount");
                    return;

                }else if(TextUtils.isEmpty(etTime.getText())){
                    etTime.setError("Enter Time");
                    return;
                }else if (TextUtils.isEmpty(etRate.getText())){
                    etRate.setError("Enter Rate");
                    return;
                }else {
                    float first, second, third, result;
                    first = Float.parseFloat(etPrinciple.toString().trim());
                    second = Float.parseFloat(etTime.toString().trim());
                    third = Float.parseFloat(etRate.toString().trim());
                    result = first*second*third/100;
                    tvResult.setText(Float.toString(result));

                }

            }
        });



    }
}

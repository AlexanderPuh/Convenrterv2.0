package com.alexb8466gmail.convenrterv20;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by User on 02.01.2017.
 */

public class ConverterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        final TextView countParrots = (TextView) findViewById(R.id.result_section);
        final int cValue=getIntent().getExtras().getInt(MainActivity.PARAM_PARROTS);


        // ((TextView) findViewById(R.id.result_section)).setText(R.string.converter_results  + getIntent().getExtras().getString(MainActivity.PARAM_PARROTS));

        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.groupChoice);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                switch (checkId){
                    case R.id.parrots_choice:
                        countParrots.setText(cValue+" попугая");
                        break;
                    case R.id.meters_choice:
                        countParrots.setText(cValue*5+" метров");
                        break;}
            }
        });
    }
    public void onBackClick(View view)
    {

        setContentView(R.layout.activity_main);

    }

}

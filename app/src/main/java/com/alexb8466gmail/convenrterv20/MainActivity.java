package com.alexb8466gmail.convenrterv20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final String PARAM_PARROTS="parrots";
    private EditText numParrots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_item:
                setContentView(R.layout.activity_references);
                return true;
            case R.id.menu_home:
                setContentView(R.layout.activity_main);
                return true;
            case R.id.item_converter:
                setContentView(R.layout.activity_converter);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }
    public void onParrotsClick(View view)
    {
        numParrots=(EditText)findViewById(R.id.numParrots);

        final int counterOfParrots=Integer.parseInt(numParrots.getText().toString());
        if(counterOfParrots<0||counterOfParrots>100)
        {

            Toast.makeText(this, R.string.error_value_parrots, Toast.LENGTH_LONG).show();
        }
        else {
            final Intent intent = new Intent(this, ConverterActivity.class);
            intent.putExtra(PARAM_PARROTS, counterOfParrots);
            startActivity(intent);
        }
    }
}

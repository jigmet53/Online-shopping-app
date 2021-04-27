package com.example.ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText pa, ph, e, n;
    CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pa = (EditText) findViewById(R.id.pa);
        n = (EditText) findViewById(R.id.n);
        ph = (EditText) findViewById(R.id.ph);
        e = (EditText) findViewById(R.id.e);
        checkBox= (CheckBox)findViewById(R.id.checkBox);

    }




    public void click(View v) {

        if (!n.getText().toString().isEmpty() && !pa.getText().toString().isEmpty() && !ph.getText().toString().isEmpty() && !e.getText().toString().isEmpty())
        {

            if(ph.length() >=10 )
            {
                if (checkBox.isChecked()) {
                    Intent i = new Intent(this, wc.class);

                    startActivity(i);
                }
                else
                {
                    Toast.makeText(this, "Please accept terms and condition!!!!", Toast.LENGTH_SHORT).show();
                }

            }
            else
            {
                Toast.makeText(this, "Phone no should be more than or equal to 10 digits!! ", Toast.LENGTH_SHORT).show();
            }




        }
        else
        {
            Toast.makeText(this, "Cannot leave empty", Toast.LENGTH_SHORT).show();

        }
    }


}
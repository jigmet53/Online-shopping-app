package com.example.ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class wc extends AppCompatActivity {
    Button b1, b2, b3, b4;
    String c1;
    String returnString;
    TextView t;

    private static final int SECOND_ACTIVITY_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc);
        b1 = findViewById(R.id.button5);
        b2 = (Button) findViewById(R.id.button3);
        b3 = (Button) findViewById(R.id.button2);
        b4 = (Button) findViewById(R.id.button4);
        t=(TextView)findViewById(R.id.t);



    }

    public void c(View v) {
        switch (v.getId()) {
            case R.id.button5:


               Intent intent = new Intent(this, shop.class);
               startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
                //Intent ii= new Intent(this,shop.class);

                startActivity(intent);


                break;
            case R.id.button3:
                t.setText("Total items added =   "+returnString);

           break;

            case R.id.button2:
               ;
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:(+49)12345789"));
                startActivity(intent1);

                break;

            case R.id.button4:
                Intent i= new Intent(this,MainActivity.class);

                startActivity(i);
                break;


        }


    }


        @Override
       protected void onActivityResult( int requestCode, int resultCode, Intent data)
        {
        super.onActivityResult(requestCode, resultCode, data);

        // check that it is the SecondActivity with an OK result
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) { // Activity.RESULT_OK


                 returnString = data.getStringExtra("keyName");








            }
        }
    }

    }

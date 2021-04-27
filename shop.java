package com.example.ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class shop extends AppCompatActivity {
  //  ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);


    }
int j1,j2,j3,j4,j5,j6,j7,j8,j9=0;





    public void click (View v)
    {
        switch(v.getId())
        {
            case R.id.i1:
                if(j1==0)
                {
                    c++;
                    j1++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.i2:
                if(j2==0)
                {
                    c++;
                    j2++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.i3:
                if(j3==0)
                {   j3++;
                    c++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.i4:
                if(j4==0)
                {
                    c++;
                    j4++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.i5:
                if(j5==0)
                {   j5++;
                    c++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.i6:
                if(j6==0)
                {
                    c++;
                    j6++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.i7:
                if(j7==0)
                {
                    c++;
                    j7++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.i8:
                if(j8==0)
                {
                    c++;
                    j8++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.i9:
                if(j9==0)
                {
                    c++;
                    j9++;
                    Toast.makeText(this, "added to the cart successfully. ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Already in the cart!!", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.i10:
                String s =String.valueOf(c);
                // Prepare data intent
                Intent intent = new Intent();
                intent.putExtra("keyName", s);
                setResult(RESULT_OK, intent);
                finish();

                return;





            }

        }
  
}

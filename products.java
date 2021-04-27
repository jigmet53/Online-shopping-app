package com.example.ca2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class products extends AppCompatActivity {
    GridView g;
    int c=0;

    int icons[] =
            {
                    R.drawable.j1, R.drawable.j2, R.drawable.j3, R.drawable.j4, R.drawable.j5,
                    R.drawable.j6, R.drawable.j7, R.drawable.j8,
                    R.drawable.j9,
            };
    String name[]={" Inférieure","Sweat à capuche","Portable" ,"Chaussures","Crocs","bicyclette" ,"Casquette","Téléphone","Veste"}; //for french
   // String name[] = {"   Lower", "   Hoodie", "   Laptop", "   Shoes", "   Crocs", "   Cycle", "   Cap", "   Phone ", "   Jacket"}; //for English

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        g = (GridView) findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter(name, icons, this);
        g.setAdapter(customAdapter);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(products.this, "Item added to the cart ", Toast.LENGTH_SHORT).show();
                c++;



            }
        });






    }
    @Override
    public void onBackPressed() {
        String s =String.valueOf(c);
        Intent intent = new Intent();
        intent.putExtra("keyName", s);
        setResult(RESULT_OK, intent);
       finish();

        return;
    }


    public class CustomAdapter extends BaseAdapter {
        private   String[] name;
        private   int[] image;
        Context context;
        LayoutInflater layoutInflater;

        public CustomAdapter(String[] name, int[] image, Context context) {
            this.name = name;
            this.image = image;
            this.context = context;
            this.layoutInflater=(LayoutInflater)context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
        }




        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            if(view==null)
            {
                view=layoutInflater.inflate(R.layout.singleframe , parent,false);
            }
            TextView textView=view.findViewById(R.id.textView);
            ImageView imageView=view.findViewById(R.id.imageView);

            textView.setText(name[position]);
            imageView.setImageResource(image[position]);

            return  view;

        }
    }




}
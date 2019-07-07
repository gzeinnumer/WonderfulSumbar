package com.sarah.labp2komp8.wonderfulsumbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListWisata extends ActionBarActivity {
String [] dataWisata={"Jam gadang","Mandeh","Pantai Gondoriah","Air Terjun Lembah Anai",
                        "harau","Danau Maninjau","Danau Singkarak","Danau Kembar","Kelok Sambilan"
                        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_wisata);

        ListView listView=(ListView)findViewById(R.id.listwisata);

        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<String>
                (this,R.layout.textwisata,R.id.text,dataWisata);
        listView.setAdapter(arrayAdapter);
    }



}

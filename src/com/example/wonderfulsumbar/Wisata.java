package com.example.wonderfulsumbar;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Wisata extends Activity {

	ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] Pil;
    String[] Ltn;
    String[] Gbr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wisata);
		
lv = (ListView) findViewById(R.id.list);
		
		Pil = new String[]
				{"	Jam Gadang","	Mandeh","	MENTAWAI",
				"	Pulau Pasumpahan","	Danau Singkarak",
				"	Harau","	Kelok 9","	Danau Maninjau",
				"	Istana Pagaruyuang","	Festival Tabuik"};
		
		Gbr = new String[] 
				{Integer.toString(R.drawable.big1),
                Integer.toString(R.drawable.big2),
                Integer.toString(R.drawable.big3),
                Integer.toString(R.drawable.big4),
                Integer.toString(R.drawable.big5),
                Integer.toString(R.drawable.big6),
                Integer.toString(R.drawable.big7),
                Integer.toString(R.drawable.big8),
                Integer.toString(R.drawable.big9),
                Integer.toString(R.drawable.big10)};
		
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Gbr.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
           
            map.put("gbr", Gbr[i]);
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.textview,
                new String[] {"gbr"},
                new int[] {R.id.imV});
      lv.setAdapter(Adapter);
      lv.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int Position,
				long arg3) {
			// TODO Auto-generated method stub
			String s=Pil[Position];
            Intent i=new Intent(Wisata.this, PilihanDestinasi.class);
            i.putExtra("listWisata",s);
            startActivity(i);
            
			
		}
    	  
    	  
	});
  }

}
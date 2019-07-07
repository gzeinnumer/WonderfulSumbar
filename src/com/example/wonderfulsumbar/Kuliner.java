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
import android.widget.AdapterView.OnItemClickListener;

public class Kuliner extends Activity {
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
		setContentView(R.layout.activity_kuliner);
		lv = (ListView) findViewById(R.id.listMakanan);
		
		Pil = new String[]
				{"	Rendang","	Dendeng Balado","	Dendeng Batokok",
				"	Soto Padang","	Sate Padang",
				"	Nasi Kapau","	Katan Durian"};
		
		
		
		Gbr = new String[] {Integer.toString(R.drawable.makan1),
                Integer.toString(R.drawable.makan2),
                Integer.toString(R.drawable.makan3),
                Integer.toString(R.drawable.makan4),
                Integer.toString(R.drawable.makan5),
                Integer.toString(R.drawable.makan6),
                Integer.toString(R.drawable.makan7)};
		
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
            
            map.put("gbr", Gbr[i]);
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.makanan,
        		new String[] {"list","gbr"},
                new int[] {R.id.tv_nama,R.id.imV});
      lv.setAdapter(Adapter);
      lv.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View arg1, int Position,
				long arg3) {
			// TODO Auto-generated method stub
			String s=Pil[Position];
            Intent i=new Intent(Kuliner.this, PilihanKuiner.class);
            i.putExtra("listMakanan",s);
            startActivity(i);
            
			
		}
    	  
    	  
	});
  }
}

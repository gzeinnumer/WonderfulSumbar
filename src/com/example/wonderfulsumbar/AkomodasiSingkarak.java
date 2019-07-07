package com.example.wonderfulsumbar;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class AkomodasiSingkarak extends Activity {
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
		setContentView(R.layout.activity_akomodasi_singkarak);
		lv = (ListView) findViewById(R.id.listSingkarak);
		
		Pil = new String[]
				{" Singkarak Sumpur Hotel"," Hotel Palapa Prima"};
		Ltn = new String[]{" X Koto Singkarak,Tanah Datar",
				" X Koto Singkarak,Solok"};
		Gbr = new String[] {Integer.toString(R.drawable.sing1),
                Integer.toString(R.drawable.sing2)};
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
           map.put("ltn", Ltn[i]);
            map.put("gbr", Gbr[i]);
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_singkarak,
                new String[] {"list","ltn","gbr"},
                new int[] {R.id.tv_nama,R.id.tv_ltn,R.id.imV});
      lv.setAdapter(Adapter);
      lv.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View arg1, int Position,
				long arg3) {
			// TODO Auto-generated method stub
			
			
		}
    	  
    	  
	});
  }

}

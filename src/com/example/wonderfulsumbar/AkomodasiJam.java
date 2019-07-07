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

public class AkomodasiJam extends Activity {
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
		setContentView(R.layout.activity_akomodasi_jam);
		lv = (ListView) findViewById(R.id.listJam);
		
		Pil = new String[]
				{" De Kock Kafe"," Treeli Boutique Hotel"," Starli Hotel",
				" Grand Rocky Hotel"," Bamboosa",
				" Bunda Hotel"};
		Ltn = new String[]{" (0.3 km dari Jam Gadang)",
				" (0.7 km dari Jam Gadang)",
				" (0.3 km dari Jam Gadang)",
				" (0.4 km dari Jam Gadang)",
				" (1 km dari Jam Gadang)",
				" (0.4 km dari Jam Gadang)"};
		
		Gbr = new String[] {Integer.toString(R.drawable.bkt1),
                Integer.toString(R.drawable.bkt2),
                Integer.toString(R.drawable.bkt3),
                Integer.toString(R.drawable.bkt4),
                Integer.toString(R.drawable.bkt5),
                Integer.toString(R.drawable.bkt6)};
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
           map.put("ltn", Ltn[i]);
            map.put("gbr", Gbr[i]);
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_jam,
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
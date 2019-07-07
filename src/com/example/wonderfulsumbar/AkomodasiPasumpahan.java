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

public class AkomodasiPasumpahan extends Activity {

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
		setContentView(R.layout.activity_akomodasi_pasumpahan);
		lv = (ListView) findViewById(R.id.listPasumpahan);
		
		Pil = new String[]
				{" La Villa Sofia"," Hangtuah Hotel"," D’Dhave Hotel",
				" Hotel Femina"," Bunda Hotel"};
		Ltn = new String[]{" Bungus",
				" Jl. Pemuda No.1 Padang",
				" Jl. Purus IV NO.12A, Padang",
				" Jl. Bagindo Azizchan No.15, Padang",
				" Jl. Bundo Kanduang No.19, Padang"};
		
		Gbr = new String[] {Integer.toString(R.drawable.pasum1),
                Integer.toString(R.drawable.pasum2),
                Integer.toString(R.drawable.pasum3),
                Integer.toString(R.drawable.pasum4),
                Integer.toString(R.drawable.pasum5)};
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
           map.put("ltn", Ltn[i]);
            map.put("gbr", Gbr[i]);
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_pasumpahan,
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
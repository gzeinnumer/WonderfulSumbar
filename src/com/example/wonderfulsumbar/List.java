package com.example.wonderfulsumbar;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class List extends Activity {

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
		setContentView(R.layout.activity_list);
		lv = (ListView) findViewById(R.id.list);
		
		Pil = new String[]
				{"	Jam Gadang","	Mandeh","	MENTAWAI",
				"	Pulau Pasumpahan","	Danau Singkarak",
				"	Harau","	Kelok 9","	Danau Maninjau",
				"	Istana Pagaruyuang","	Festival Tabuik",
				"	Pandai Sikek","	Nagari Pariangan"};
		Ltn = new String[]{"	Bukit Tinggi","	Pesisir Selatan",
				"	Kepulauan Mentawai","	Padang",
				"	Solok","	Payakumbuh","	Payakumbuh",
				"	Agam","	Batusangkar","	Pariaman",
				"	Tanah Datar","	Tanah Datar"};
		
		Gbr = new String[] {Integer.toString(R.drawable.jamgad),
                Integer.toString(R.drawable.pulau),
                Integer.toString(R.drawable.mentawai),
                Integer.toString(R.drawable.pasumpahan),
                Integer.toString(R.drawable.singkarak),
                Integer.toString(R.drawable.lembah),
                Integer.toString(R.drawable.kelok),
                Integer.toString(R.drawable.maninjau),
                Integer.toString(R.drawable.pagaruyuang),
                Integer.toString(R.drawable.tabuik),
                Integer.toString(R.drawable.pusako),
                Integer.toString(R.drawable.pariangan)};
		
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
           map.put("ltn", Ltn[i]);
            map.put("gbr", Gbr[i]);
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_isi_lv,
                new String[] {"list","ltn","gbr"},
                new int[] {R.id.tv_nama,R.id.tv_ltn,R.id.imV});
      lv.setAdapter(Adapter);
      lv.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View arg1, int Position,
				long arg3) {
			// TODO Auto-generated method stub
			String s=Pil[Position];
            Intent i=new Intent(List.this, PilihanDestinasi.class);
            i.putExtra("listWisata",s);
            startActivity(i);
            
			
		}
    	  
    	  
	});
  }

}

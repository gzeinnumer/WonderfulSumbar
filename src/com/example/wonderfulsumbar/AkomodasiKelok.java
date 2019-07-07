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

public class AkomodasiKelok extends Activity {

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
		setContentView(R.layout.activity_akomodasi_kelok);
		lv = (ListView) findViewById(R.id.listKelok);
		
		Pil = new String[]
				{"Tidak Tersedia",""};
		
		
		
		mylist = new ArrayList<HashMap<String,String>>();
	       
        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
           
            mylist.add(map);
		
		
	    
	}

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_kelok,
                new String[] {"list"},
                new int[] {R.id.tv_nama});
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

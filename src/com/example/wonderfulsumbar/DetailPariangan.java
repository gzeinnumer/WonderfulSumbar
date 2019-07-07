package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class DetailPariangan extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail_pariangan);
		TabHost tabHost=getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent =getIntent();
		
		intent =new Intent().setClass(DetailPariangan.this, LokasiPariangan.class);
		spec=tabHost.newTabSpec("Tag1"); 
		spec.setIndicator("Maps",null);
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		
		intent =new Intent().setClass(DetailPariangan.this, AkomodasiPariangan.class);
		spec=tabHost.newTabSpec("Tag1"); 
		spec.setIndicator("Akomodasi",null);
		spec.setContent(intent);
		tabHost.addTab(spec);
	}


}

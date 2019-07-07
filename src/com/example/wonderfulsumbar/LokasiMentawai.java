package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class LokasiMentawai extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lokasi_mentawai);
		WebView browser =(WebView)findViewById(R.id.lokasiMentawai);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/lokasiMentawai.html");
	}

	
}

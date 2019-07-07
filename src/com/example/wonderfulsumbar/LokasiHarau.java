package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class LokasiHarau extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lokasi_harau);
		WebView browser =(WebView)findViewById(R.id.lokasiHarau);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/lokasiHarau.html");
	}


}

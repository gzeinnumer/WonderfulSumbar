package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class LokasiPasumpahan extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lokasi_pasumpahan);
		WebView browser =(WebView)findViewById(R.id.lokasiPasumpahan);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/lokasiPasumpahan.html");
	}


}

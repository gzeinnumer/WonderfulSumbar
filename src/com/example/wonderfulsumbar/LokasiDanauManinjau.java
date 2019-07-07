package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class LokasiDanauManinjau extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lokasi_danau_maninjau);
		WebView browser =(WebView)findViewById(R.id.lokasiDanauManinjau);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/lokasiDanauManinjau.html");
	}


}

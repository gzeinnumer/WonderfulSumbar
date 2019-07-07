package com.example.wonderfulsumbar;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;



public class Splash extends Activity {

	private static int durasi=4000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent in =new Intent(Splash.this,MainActivity.class);
				startActivity(in);
				finish();
				
			}
		}, durasi);
		
	}
	

}

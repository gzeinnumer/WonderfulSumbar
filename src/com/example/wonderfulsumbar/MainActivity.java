package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton btn1,btn2,btn3,btn4,btn5,btn6;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(ImageButton)findViewById(R.id.btnSumbar);
		btn2=(ImageButton)findViewById(R.id.btnWisata);
		btn3=(ImageButton)findViewById(R.id.btnList);
		btn4=(ImageButton)findViewById(R.id.btnTrans);
		btn6=(ImageButton)findViewById(R.id.btnJajanan); 
		btn5=(ImageButton)findViewById(R.id.btnKeluar);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MainActivity.this,Sumbar.class); 
				startActivity(in);				
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MainActivity.this,Wisata.class);
				startActivity(in);
				
			}
		});
		
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MainActivity.this,List.class);
				startActivity(in);
				
			}
		});
		
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MainActivity.this,Biaya.class);
				startActivity(in);
				
			}
		});
		btn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MainActivity.this,Kuliner.class);
				startActivity(in);
				
			}
		});
		btn5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent in=new Intent(MainActivity.this,About.class);
				startActivity(in);
			}
			
		});
		
	}
	
	
		
	


}





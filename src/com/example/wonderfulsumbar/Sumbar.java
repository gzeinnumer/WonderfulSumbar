package com.example.wonderfulsumbar;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.TextView;


@SuppressWarnings("deprecation")
public class Sumbar extends Activity {

	TextView txt;
	private static TextView DotsText[];
	private int DotsCount;
	private LinearLayout DotsLayout;
	public static int l;
	public static int idxMenu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sumbar);
		txt=(TextView)findViewById(R.id.txt);
		Intent data= getIntent();
		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
		gallery.setAdapter(new SlideAdapter(this));
		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
		// here we count the number of images we have to know how many dots we
		// need
		DotsCount = gallery.getAdapter().getCount();

		DotsText = new TextView[DotsCount];
		for (int i = 0; i < DotsCount; i++) {
			DotsText[i] = new TextView(this);
			DotsText[i].setText(".");
			DotsText[i].setTextSize(45);
			DotsText[i].setTypeface(null, Typeface.BOLD);
			DotsText[i].setTextColor(android.graphics.Color.GRAY);
			DotsLayout.addView(DotsText[i]);

			gallery.setOnItemClickListener(new OnItemClickListener() {

	
				@Override
				public void onItemClick(AdapterView<?> parent, View arg1,
						int position, long id) {
					// TODO Auto-generated method stub
				
					
				}
			});
			gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@SuppressWarnings("rawtypes")
				@Override
				public void onItemSelected(AdapterView adapterView, View view,
						int position, long l) {

					// status.setText(menu_name[position]);
					for (int i = 0; i < DotsCount; i++) {
						Sumbar.DotsText[i].setTextColor(Color.GRAY);
					}

					Sumbar.DotsText[position].setTextColor(Color.GREEN);

				}

				@SuppressWarnings("rawtypes")
				@Override
				public void onNothingSelected(AdapterView adapterView) {

				}
			});
		}

	}
}


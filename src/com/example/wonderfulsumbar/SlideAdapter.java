package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class SlideAdapter extends BaseAdapter {
	
	private Context context;

	// array of integers for images IDs
	private Integer[] gambarMenu = { R.drawable.gambar1, R.drawable.gambar2,
			R.drawable.gambar3,R.drawable.gambar4,R.drawable.gambar5, };
	
	public SlideAdapter(Context c) {
		context = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return gambarMenu.length;
		
	}

	@Override
	public Object getItem(int i) {
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public View getView(int i, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(context);
		imageView.setImageResource(gambarMenu[i]);
		imageView.setLayoutParams(new Gallery.LayoutParams(
				ViewGroup.LayoutParams.FILL_PARENT,
				ViewGroup.LayoutParams.FILL_PARENT));
		return imageView;
	}

	

	

}

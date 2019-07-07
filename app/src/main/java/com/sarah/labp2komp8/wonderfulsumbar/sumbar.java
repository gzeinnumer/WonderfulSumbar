package com.sarah.labp2komp8.wonderfulsumbar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class sumbar extends ActionBarActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumbar);
        txt=(TextView)findViewById(R.id.txt);
        Intent data= getIntent();
    }


}

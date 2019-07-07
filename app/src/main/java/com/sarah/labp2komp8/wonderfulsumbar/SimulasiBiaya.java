package com.sarah.labp2komp8.wonderfulsumbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class SimulasiBiaya extends ActionBarActivity {

    String [] datatujuan={"Jam gadang","Mandeh","Pantai Gondoriah","Air Terjun Lembah Anai",
            "harau","Danau Maninjau","Danau Singkarak","Danau Kembar","Kelok Sambilan"
    };
    String [] datatrans={"Bus","Sewa Mobil (Avanza)","Sewa Bus Pariwisata"};
    String [] datahari={"1","2","3","4","5","6","7","8","9","10","11","12","13"};
    //UNTUK HARI SEBAIKNYA EDIT TEXT
    //(CUMA MENCONTOHKAN PAKAI COSTUM SPRINNER)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasi_biaya);

        Spinner spTujuan=(Spinner)findViewById(R.id.spTujuan);
        Spinner spTrans=(Spinner)findViewById(R.id.spTrans);
        Spinner spHari=(Spinner)findViewById(R.id.spHari);

        ArrayAdapter<String> arrayAdapterTujuan = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item,datatujuan);
        spTujuan.setAdapter(arrayAdapterTujuan);

        ArrayAdapter<String> arrayAdapterTrans = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_dropdown_item,datatrans);
        spTrans.setAdapter(arrayAdapterTrans);

        ArrayAdapter<String> arrayAdapterHari = new ArrayAdapter<String>
                (this,R.layout.txtspinner,R.id.costumSpinner,datahari);
        spHari.setAdapter(arrayAdapterHari);
    }



}

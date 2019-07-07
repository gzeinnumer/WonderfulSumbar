package com.example.wonderfulsumbar;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Biaya extends Activity {

	EditText hari;
	TextView rute,hasil;
	ImageView gambarRute;
	Button submit;
	String[]wisata ={"Jam Gadang","Mandeh","MENTAWAI",
			"Pulau Pasumpahan","Danau Singkarak",
			"Harau","Kelok 9","Danau Maninjau",
			"Istana Pagaruyuang","Festival Tabuik",
			"Pandai Sikek","Nagari Pariangan"};
	
	String[]transport ={
			"Sewa Travel","Bus","Sewa Bus Pariwisata"
	};
	
	Spinner tujuan,trans;
	String destinasi,angkutan;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_biaya);
		hari=(EditText)findViewById(R.id.org);
		hasil=(TextView)findViewById(R.id.hasil);
		rute=(TextView)findViewById(R.id.rute);
		gambarRute=(ImageView)findViewById(R.id.gambarRute);
		tujuan=(Spinner)findViewById(R.id.tujuan);
		trans=(Spinner)findViewById(R.id.trans);
		submit=(Button)findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener() {
			double tarif;
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(destinasi=="Jam Gadang"){
					gambarRute.setImageResource(R.drawable.jamrute);
					rute.setText("Rute :Ambil Jl. Piai Tanah Sirah Nan ke Jl. By Pass\n lalu ke Jl. Raya Padang-Painan Ikuti \nJl. Jend. Sudirman Manna dan \nJl. Raya Padang - Bukittinggi \n ke Jl. Jend. Sudirman Manna di Bukittinggi");
					if(angkutan=="Sewa Travel"){
						tarif=550000;
					}
					else if(angkutan=="Bus"){
						tarif=70000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
					
				}
				else if(destinasi=="Mandeh"){
					gambarRute.setImageResource(R.drawable.mandehrute);
					rute.setText("Rute :Ambil Jl. Piai Tanah Sirah Nan dan \nJl. Padang - Solok ke Jalan Padang - Bengkulu/nke Jl. By Pass/Jl. Jend. Sudirman Manna/\nJl. Raya Padang-Painan \nIkuti Jl. Jend. Sudirman Manna/nJl. Raya Padang-Painan ke Nanggalo\n naik kapal untuk ke pulau,\nharga belum termasuk biaya transportasi darat");
					if(angkutan=="Sewa Travel"){
						tarif=300000;
					}
					else if(angkutan=="Bus"){
						tarif=50000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="MENTAWAI"){
					gambarRute.setImageResource(R.drawable.rutementawai);
					rute.setText("Rute : Dari Bim / Padang ke Pelabuhan Bungus dan naik kapal ke mentawai, \nharga kapal belom termasuk transportasi darat");
					if(angkutan=="Sewa Travel"){
						tarif=200000;
					}
					else if(angkutan=="Bus"){
						tarif=25000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Pulau Pasumpahan"){
					gambarRute.setImageResource(R.drawable.pasumrute);
					rute.setText("Rute : Ikuti Jalan Padang - Bengkulu sampai ke\nTlk. Kabung Selatan,\n Bungus Tlk. Kabung, Kota Padang, Sumatera Barat\n naik kapal ke pulau pasumpahan,\nbelum termasuk biaya transportasi darat");
					if(angkutan=="Sewa Travel"){
						tarif=200000;
					}
					else if(angkutan=="Bus"){
						tarif=25000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Danau Singkarak"){
					gambarRute.setImageResource(R.drawable.singkarakrute);
					rute.setText("Rute : Ikuti Jl. Piai Tanah Sirah Nan ke \nJl. Cupak Tangah di Cupak Tangah,\nAmbil Jl. Padang - Solok ke \nJl. Sutama Saniangbaka di Sumani\nTetap di Jl. Sutama Saniangbaka. \nBerkendara ke Jalan Raya Paninggahan/Jl. Raya Malalo");
					if(angkutan=="Sewa Travel"){
						tarif=300000;
					}
					else if(angkutan=="Bus"){
						tarif=55000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Harau"){
					gambarRute.setImageResource(R.drawable.haraurute);
					rute.setText("Rute :Jl. Raya Padang - Bukittinggi,\nlalu Tetap di Jl. Raya Bukittinggi - Payakumbuh. \nBerkendara ke Jalan Raya Tarantang di\n Kabupaten Lima Puluh Kota");
					if(angkutan=="Sewa Travel"){
						tarif=400000;
					}
					else if(angkutan=="Bus"){
						tarif=45000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Kelok 9"){
					gambarRute.setImageResource(R.drawable.kelokrute);
					rute.setText("Rute :Jl. Raya Padang - Bukittinggi,\nlalu Tetap di Jl. Raya Bukittinggi - Payakumbuh.\n Berkendara ke Jl. Sumbar-Riau di Harau");
					if(angkutan=="Sewa Travel"){
						tarif=400000;
					}
					else if(angkutan=="Bus"){
						tarif=45000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Danau Maninjau"){
					gambarRute.setImageResource(R.drawable.maninjaurute);
					rute.setText("Rute :Jl. Maninjau - Lubuk Basung");
					if(angkutan=="Sewa Travel"){
						tarif=550000;
					}
					else if(angkutan=="Bus"){
						tarif=70000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Istana Pagaruyuang"){
					gambarRute.setImageResource(R.drawable.istanarute);
					rute.setText("Rute :Jl. Padang - Solok dan \nJl. Padang Panjang - Solok");
					if(angkutan=="Sewa Travel"){
						tarif=550000;
					}
					else if(angkutan=="Bus"){
						tarif=70000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Festival Tabuik"){
					gambarRute.setImageResource(R.drawable.pantairute);
					rute.setText("Rute :Jl. Jend. Sudirman Manna dan \nJl. Syekh Burhanuddin ke \n Jl. Tugu Perjuangan in Pariaman");
					if(angkutan=="Sewa Travel"){
						tarif=250000;
					}
					else if(angkutan=="Bus"){
						tarif=30000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1500000;
					}
				}
				else if(destinasi=="Pandai Sikek"){
					gambarRute.setImageResource(R.drawable.sikekrute);
					rute.setText("Rute :Jl. Jend. Sudirman Manna dan Jl. Raya Padang - Bukittinggi\n ko Panyalaian ambil Jl. Siaga dan \n Jl. Pandai Sikek ke Pandai Sikek");
					if(angkutan=="Sewa Travel"){
						tarif=450000;
					}
					else if(angkutan=="Bus"){
						tarif=30000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1200000;
					}
				}
				else if(destinasi=="Nagari Pariangan"){
					gambarRute.setImageResource(R.drawable.parianganrute);
					rute.setText("Rute :Jl. Padang-Solok dan Jl.Padang Panjang-Solok ke Batu Basa,\n lalu pilih destinasi tujuan");
					if(angkutan=="Sewa Travel"){
						tarif=450000;
					}
					else if(angkutan=="Bus"){
						tarif=30000;
					}
					else if(angkutan=="Sewa Bus Pariwisata"){
						tarif=1200000;
					}
				}
				String HariSewa=hari.getText().toString();
				double banyakHari=Double.parseDouble(HariSewa);
				double total=tarif*banyakHari;
				hasil.setText(String.valueOf(total));
				
			}
		});
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_dropdown_item,wisata);
		tujuan.setAdapter(adapter);
		tujuan.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int index=tujuan.getSelectedItemPosition();
				Toast.makeText(getBaseContext(),
				"Selected Item :"+ wisata[index],Toast.LENGTH_SHORT).show();
				destinasi=tujuan.getSelectedItem().toString();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	 
			
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_dropdown_item,transport);
		trans.setAdapter(adap);
		trans.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int index=trans.getSelectedItemPosition();
				Toast.makeText(getBaseContext(), "SELECTED ITEM :"+transport[index],
						Toast.LENGTH_SHORT).show();
				angkutan=trans.getSelectedItem().toString();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
}

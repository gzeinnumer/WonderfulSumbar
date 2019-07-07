package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class PilihanDestinasi extends Activity {
	
	private static TextView DotsText[];
	private int DotsCount;
	private LinearLayout DotsLayout;
	public static int l;
	public static int idxMenu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pilihan_destinasi);
		TextView judul=(TextView)findViewById(R.id.judul);
        ImageView gambar=(ImageView)findViewById(R.id.gambar);
        TextView detail=(TextView)findViewById(R.id.detail);
        Button btnDetail=(Button)findViewById(R.id.btnDetail);
        String i=getIntent().getStringExtra("listWisata");
        judul.setText(i);

        if(i.equals("	Jam Gadang")){
        	
            detail.setText("\tJam Gadang adalah nama untuk menara jam yang terletak di pusat kota Bukittinggi, Sumatera Barat, Indonesia. Menara jam ini memiliki jam dengan ukuran besar di empat sisinya sehingga dinamakan Jam Gadang, sebutan bahasa Minangkabau yang berarti jam besar.Selain sebagai pusat penanda kota Bukittinggi, Jam Gadang juga telah dijadikan sebagai objek wisata dengan diperluasnya taman di sekitar menara jam ini. Taman tersebut menjadi ruang interaksi masyarakat baik di hari kerja maupun di hari libur. Acara-acara yang sifatnya umum biasanya diselenggarakan di sekitar taman dekat menara jam ini.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent in=new Intent(PilihanDestinasi.this,DetailJam.class); 
					startActivity(in);	
					
				}
			});
           
    		Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideDua(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }

        else if(i.equals("	Mandeh")){
            detail.setText("\tKawasan Wisata Mandeh merupakan kawasan wisata yang terletak di Kecamatan Koto XI Tarusan, Pesisir Selatan yang berbatas langsung dengan Kota Padang. Kawasan ini hanya berjarak 56 km dari Padang dengan Luas ± 18.000 ha dan waktu tempuh sekitar 56 menit. Kawasan Wisata Mandeh melingkupi 7 kampung di 3 nagari yang dihuni oleh 9.931 jiwa penduduk dengan mata pencaharian bertani, berternak dan nelayan. Objek wisata kawasan Mandeh (Mandeh Resort) sudah dikenal baik tingkat nasional maupun Internasional dengan adanya investasi asing (Italia), mengembangkan resort wisata yang dikenal dengan Cubadak Paradiso");
           
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailMandeh.class); 
					startActivity(in);	
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideSatu(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }

        else if(i.equals("	Harau")){
            detail.setText("\tLembah Harau adalah sebuah ngarai dekat kota Payakumbuh di kabupaten Limapuluh Koto, provinsi Sumatera Barat. Lembah Harau diapit dua bukit cadas terjal dengan ketinggian mencapai 150 meter berupa batu pasir yang terjal berwarna-warni, dengan ketinggian 100 sampai 500 meter. Topografi Cagar Alam Harau adalah berbukit-bukit dan bergelombang. Tinggi dari permukaan laut adalah 500 sampai 850 meter, bukit tersebut antara lain adalah Bukit Air Putih, Bukit Jambu, Bukit Singkarak dan Bukit Tarantang.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailHarau.class); 
					startActivity(in);	
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideTiga(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }

        else if(i.equals("	MENTAWAI")){
            detail.setText("\tKepulauan Mentawai adalah gugusan pulau-pulau yang secara geografis terletak di Samudera Hindia dan secara administratif masuk ke dalam provinsi Sumatera Barat, Indonesia. Kepulauan Mentawai berada di sisi barat provinsi Sumatera barat. Penduduk asli Mentawai mempunyai kebudayaan yang berbeda dengan penduduk Minangkabau karena tepisah oleh laut.\n\tKepulauan Mentawai mempunyai empat pulau besar, yakni: Pulau Siberut, Pulau Sipora, Pulau Pagai Utara, Pulau Pagai Selatan dan beberapa pulau-pulau kecil.Di wilayah laut Kepulauan Mentawai ada beberapa selat, antara lain: Selat Mentawai, Selat Siberut, Selat Sipora, Selat Sikakap, dan Selat Sanding.\n\tSejak tahun 1999, wilayah Kepulauan Mentawai dikukuhkan menjadi sebuah kabupaten bernama Kabupaten Kepulauan Mentawai dengan ibu kota di Tuapejat.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailMentawai.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideEmpat(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        
        else if(i.equals("	Pulau Pasumpahan")){
            detail.setText("\tPulau Pasumpahan adalah sebuah pulau yang berada di perairan kecamatan Bungus Teluk Kabung Kota Padang provinsi Sumatera Barat, Indonesia. Klaim akan keindahan lautnya membuat pulau ini mulai dikenal oleh wisatawan lokal dan internasional.Pulau Pasumpahan berada sekitar 200 meter dari Pulau Sikuai. Pulau ini memiliki objek wisata pantai pasir putih dengan terumbu karang yang masih terjaga.\n\tPotensi wisata bawah laut di kawasan wisata bahari pantai barat Kota Padang adalah kawasan ekosistem terumbu karang yang terdapat hampir di setiap pulau, di antaranya di Pulau Gosong. Selain dari terumbu karang berbagai jenis ikan karang/ikan-ikan hias juga sangat menarik untuk dinikmati oleh wisatawan. Di perairan Kota Padang ditemukan 21 jenis ikan kepe-kepe yang didominasi oleh Chaetodon trifascialis. Lokasi-Iokasi penyelaman yang sudah mulai dipasarkan kepada wisatawan antara lain Pulau Sironjong, Pulau Ular, Pulau Sirandah, dan Pulan Pandan.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailPasumpahan.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideLima(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Kelok 9")){
            detail.setText("\tKelok 9 atau Kelok Sembilan adalah ruas jalan berkelok yang terletak sekitar 30 km sebelah timur dari Kota Payakumbuh, Sumatera Barat menuju Provinsi Riau. Jalan ini membentang sepanjang 300 meter di Jorong Aie Putiah, Nagari Sarilamak, Kecamatan Harau, Kabupaten Lima Puluh Kota, Sumatera Barat dan merupakan bagian dari ruas jalan penghubung Lintas Tengah Sumatera dan Pantai Timur Sumatera. Jalan ini memiliki tikungan yang tajam dan lebar sekitar 5 meter, berbatasan dengan jurang, dan diapit oleh dua perbukitan di antara dua cagar alam: Cagar Alam Air Putih dan Cagar Alam Harau.");
           
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailKelok.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideEnam(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Danau Singkarak")){
        	detail.setText("\tDanau Singkarak adalah sebuah danau yang membentang di dua kabupaten di provinsi Sumatera Barat, Indonesia, yaitu kabupaten Solok dan kabupaten Tanah Datar.\n\tDanau Singkarak merupakan salah satu hasil dari proses tektonik yang dipengaruhi oleh Sesar Sumatra. Danau ini adalah bagian dari Cekungan Singkarak-Solok yang termasuk di antara segmen dari Sesar Sumatra.\n\t Cekungan dari danau ini terbentuk dari sebuah amblesan yang disebabkan oleh aktivitas pergerakan Sesar Sumatera. Cekungan besar ini terbendung oleh material vulkanik dari letusan gunungapi sekitarnya. Akibat pembendungan material vulkanik ini terbentuklah Danau maninjau di satu bagian Cekungan Singkarak-Solok. Berbeda dengan Danau Maninjau yang terbentuk akibat letusan gununapi, Danau Singkarak terbentuk utamanya karena proses tektonik.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailSingkarak.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideTujuh(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Danau Maninjau")){
        	detail.setText("\tDanau Maninjau merupakan danau vulkanik ini berada di ketinggian 461,50 meter di atas permukaan laut. Danau Maninjau merupakan sebuah kaldera dari letusan besar gunung api yang menghamburkan kurang lebih 220-250 km3 material piroklastik. Kaldera tersebut terbentuk karena letusan gunung api strato komposit yang berkembang di zona tektonik sistem Sesar Besar Sumatera yang bernama gunung Sitinjau (menurut legenda setempat), hal ini dapat terlihat dari bentuk bukit sekeliling danau yang menyerupai seperti dinding.\n\tPuncak tertinggi diperbukitan sekitar Danau Maninjau dikenal dengan nama Puncak Lawang. Untuk bisa mencapai Danau Maninjau jika dari arah Bukittinggi maka akan melewati jalan berkelok-kelok yang dikenal dengan Kelok 44 sepanjang kurang lebih 10 km mulai dari Ambun Pagi sampai ke Maninjau.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailManinjau.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideDelapan(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Istana Pagaruyuang")){
        	detail.setText("\tIstana Baso yang lebih terkenal dengan nama Istana Pagaruyung, adalah sebuah istana yang terletak di kecamatan Tanjung Emas, kota Batusangkar, kabupaten Tanah Datar, Sumatera Barat. Istana ini merupakan objek wisata budaya yang terkenal di Sumatera Barat.\n\tIstano Basa yang berdiri sekarang sebenarnya adalah replika dari yang asli. Istano Basa asli terletak di atas bukit Batu Patah dan terbakar habis pada sebuah kerusuhan berdarah pada tahun 1804. Istana tersebut kemudian didirikan kembali namun kembali terbakar tahun 1966.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailPagaruyung.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideSembilan(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Festival Tabuik")){
        	detail.setText("\n\tTabuik (Indonesia: Tabut) adalah perayaan lokal dalam rangka memperingati Asyura, gugurnya Imam Husain, cucu Muhammad, yang dilakukan oleh masyarakat Minangkabau di daerah pantai Sumatera Barat, khususnya di Kota Pariaman. \n\tFestival ini termasuk menampilkan kembali Pertempuran Karbala, dan memainkan drum tassa dan dhol. Tabuik merupakan istilah untuk usungan jenazah yang dibawa selama prosesi upacara tersebut.\n\tUpacara melabuhkan tabuik ke laut dilakukan setiap tahun di Pariaman pada 10 Muharram sejak 1831. Upacara ini diperkenalkan di daerah ini oleh Pasukan Tamil Muslim Syi'ah dari India, yang ditempatkan di sini dan kemudian bermukim pada masa kekuasaan Inggris di Sumatera bagian barat.");
           
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailTabuik.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideSepuluh(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Pandai Sikek")){
        	detail.setText("\tPandai Sikek merupakan salah satu nagari yang termasuk ke dalam wilayah kecamatan Sepuluh Koto, Kabupaten Tanah Datar, Provinsi Sumatera Barat, Indonesia. Nagari ini terletak di dekat Batusangkar, ibu kota dari kabupaten Tanah Datar. \n\tNagari Pandai Sikek juga dikenal sebagai tempat pengrajin tenun, dan ini diapresiasikan oleh pemerintah Republik Indonesia dalam gambar mata uang pecahan Rp 5.000 emisi 1999-saat ini.\n\t Produk kerajinan tenun songket Pandai Sikek tidak hanya terbatas pada berbagai macam pakaian seperti baju kurung dan destar, tetapi juga berbagai kelengkapan upacara adat dan perkawinan, seperti: kodek songket, saruang balapak, \nsaruang batabua, selendang songket atau selendang batabua tingkuluak tanduak (tutup kepala wanita), dan sesamping (perlengkapan penghulu). Songket bagi masyarakat Minangkabau merupakan jenis pakaian yang tinggi nilainya (sangat dihargai)");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailPusako.class); 
					startActivity(in);	
					
					
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideSebelas(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
        else if(i.equals("	Nagari Pariangan")){
        	detail.setText("\tNagari ini terletak di lereng Gunung Marapi pada ketinggian 500-700 meter di atas permukaan laut. Menurut Tambo Minangkabau Pariangan merupakan nagari tertua di ranah Minang.Di nagari ini termasuk yang terbaik dalam menjaga rumah adat tradisional yang disebut rumah gadang (Bahasa Minang, rumah besar),\n sehingga sampai sekarang masih dijumpai banyak yang terawat dengan baik. Pada nagari ini juga masih dijumpai surau, yang masih menjadi tempat tinggal komunal untuk pria yang belum menikah.\n\tPada Mei 2012, Nagari (desa) Pariangan terpilih sebagai salah satu dari lima desa terindah di dunia versi Budget Travel, sebuah majalah pariwisata internasional.");
            
            btnDetail.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in=new Intent(PilihanDestinasi.this,DetailPariangan.class); 
					startActivity(in);	
				
				}
			});
            Intent data= getIntent();
    		final Gallery gallery = (Gallery) findViewById(R.id.gallery);
    		gallery.setAdapter(new SlideDuabelas(this));
    		DotsLayout = (LinearLayout) findViewById(R.id.image_count);
    		// here we count the number of images we have to know how many dots we
    		// need
    		DotsCount = gallery.getAdapter().getCount();

    		DotsText = new TextView[DotsCount];
    		for (int i1 = 0; i1 < DotsCount; i1++) {
    			DotsText[i1] = new TextView(this);
    			DotsText[i1].setText(".");
    			DotsText[i1].setTextSize(45);
    			DotsText[i1].setTypeface(null, Typeface.BOLD);
    			DotsText[i1].setTextColor(android.graphics.Color.GRAY);
    			DotsLayout.addView(DotsText[i1]);

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
    						PilihanDestinasi.DotsText[i].setTextColor(Color.GRAY);
    					}

    					PilihanDestinasi.DotsText[position].setTextColor(Color.GREEN);

    				}

    				@SuppressWarnings("rawtypes")
    				@Override
    				public void onNothingSelected(AdapterView adapterView) {

    				}
    			});
    		}
        }
    }



}
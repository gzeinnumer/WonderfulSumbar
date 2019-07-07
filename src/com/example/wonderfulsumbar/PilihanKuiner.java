package com.example.wonderfulsumbar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PilihanKuiner extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pilihan_kuiner);
		TextView judul=(TextView)findViewById(R.id.judul);
        ImageView gambar=(ImageView)findViewById(R.id.gambar);
        TextView detail=(TextView)findViewById(R.id.detail);
        
        String i=getIntent().getStringExtra("listMakanan");
        judul.setText(i);
        if(i.equals("	Rendang")){
        	
            detail.setText("\tRendang daging adalah masakan tradisional bersantan dengan daging sapi sebagai bahan utamanya. Masakan khas dari Sumatera Barat, Indonesia ini sangat digemari di semua kalangan masyarakat baik itu di Indonesia sendiri ataupun di luar negeri.Selain daging sapi,rendang juga menggunakan kelapa (karambia), dan campuran dari berbagai bumbu khas Indonesia di antaranya Cabai (lado), lengkuas, serai, bawang dan aneka bumbu lainnya yang biasanya disebut sebagai (Pemasak).");
            gambar.setImageResource(R.drawable.makan1);
            
        }

        else if(i.equals("	Dendeng Balado")){
            detail.setText("\tHampir semua restoran padang yang ada di sumatera barat menyediakan menu DENDENG BALADO, makanan ini berbahan dasar daging sapi yang di potong tipis dan di kasih bumbu rempah-rempah dan di jemur hingga kering,setelah itu baru di goreng dan di kasih LADO ( cabe merah ) Rasanya sangat enak");
            gambar.setImageResource(R.drawable.makan2);
            
        }

        else if(i.equals("	Dendeng Batokok")){
            detail.setText("\tdendeng batokok juga hampir di setiap restoran padang di sediakan, bedanya adalah kalau dendeng batokok ini di tumbuk setelah di goreng dan tentunya dengan bumbunya yang khas");
            gambar.setImageResource(R.drawable.makan3);
            
        }

        else if(i.equals("	Soto Padang")){
            detail.setText("\tsumatera barat juga punya menu soto yang lebih di kenal dengan nama SOTO PADANG, soto padang yang bercita rasa gurih dengan campuran sambal merah yang khas sangat cocok untuk di cicipi bersama keluarga.");
            gambar.setImageResource(R.drawable.makan4);
            
        }
        
        else if(i.equals("	Sate Padang")){
            detail.setText("\tciri dari sate padang ini adalah tidak adanya tambahan kecap seperti halnya sate yang ada di pulau jawa dan juga sate padang memiliki ciri dengan rasa gurih bercampur pedas di tambah dengan taburan bawang goreng yang menambah cita rasanya.");
            gambar.setImageResource(R.drawable.makan5);
            
        }
        else if(i.equals("	Nasi Kapau")){
            detail.setText("\tNasi kapau ini merupakan kuliner yang berasal dari daerah bernama Kapau Sumbar. Kalau ke Bukittinggi, ada satu tempat yang terkenal dengan sajian nasi kapau-nya, yakni Pasar Lantai Wisata Lantai Dasar");
            gambar.setImageResource(R.drawable.makan6);
            
        }
        else if(i.equals("	Katan Durian")){
        	detail.setText("\tKatan merupakan olahan beras ketan yang dikukus hingga matang.Dalam proses pengukusan beras ketan ditambahkan irisan daun pandan agar wangi.Buah durian yang telah dikupas disajikan diatas piring dengan katan dan kelapa parut .Legitnya buah durian nan manis dan lembut dimakan bersamaan dengan gurihnya katan akan mampu menggoyang lidah penikmatnya.");
            gambar.setImageResource(R.drawable.makan7);
            
        }
        
    }



}

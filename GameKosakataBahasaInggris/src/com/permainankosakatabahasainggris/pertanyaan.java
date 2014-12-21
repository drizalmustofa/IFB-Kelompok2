package com.permainankosakatabahasainggris;


import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;




public class pertanyaan extends Activity implements onClickListener 
{
public int index, index2, index3, index4, index5, index6, index7, index8,
index9, index10, jumlah;
public int hasil1, hasil2, hasil3, hasil4, hasil5, hasil6, hasil7, hasil8,
hasil9, hasil10;
public static int nilai = 0;
public TextView ba;
public EditText soal1, soal2, soal3, soal4, soal5, soal6, soal7, soal8,
soal9, soal10;
public Button jawab;
public static int mHasil = 0;
public String jawaban,jawaban1,kunciString;
public static String jwaban="";

String[] pert1 = { " chair" };
String[] pert2 = { " Pilih jawaban ", "A. 8 ", "B. 32", "C. 16" };
String[] pert3 = { " Pilih jawaban", "A. 51", "B. 25", "C. 15" };
String[] pert4 = { " Pilih jawaban", "A. 14", "B. 4", "C. 10" };
String[] pert5 = { " Pilih jawaban", "A. Trapesium", "B. Layang-layang", "C. Lingkaran" };

int[] kunci = { 1, 3, 2, 3, 1, 2, 3, 2, 3, 1 };
int[] soal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


	public void onCreate (Bundle savedInstanceState)
	{ 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pertanyaan);
		
		ba = (TextView) findViewById(R.id.ba);
		jawab = (Button) findViewById(R.id.jawab);
		ba.setText("Kursi dalam bahasa inggris ... ");
		
		
		
	}
	
	public void hitungPoin(View view) {
		int jwb[] = { index, index2, index3, index4, index5, index6, index7,
		index8, index9, index10 };
		int no;

		for (int i = 0; i < kunci.length; i++) {
			if (jwb[i]==1){
				jawaban=" A ";	
				}else if (jwb[i]==2) {
				jawaban=" B ";		
				}else if (jwb[i]==3) {
				jawaban=" C ";		
				}else{
				jawaban=" - ";		
				}
			if (kunci[i]==1){
				kunciString="A";	
				}else if (kunci[i]==2) {
				kunciString="B";		
				}else if (kunci[i]==3) {
				kunciString="C";		
				}else{
				kunciString="Tidak dijawab";		
				}
			if (jwb[i] == kunci[i]) {
			mHasil = mHasil + 10;
			//ini buat ganti String tulisan pada output hasil nilai, juga yg di nilai.java juga, ini gabung....
			jawaban1=jawaban+" =>(Benar)=> "+kunciString+" \n";
			}else{
			//ini buat ganti String tulisan pada output hasil nilai, juga yg di nilai.java juga, ini gabung....
			jawaban1=jawaban+" =>(Salah)=> "+kunciString+" \n";
			}
		no=i+1;
		jwaban=jwaban+Integer.toString(no)+". "+jawaban1;
		}
		Intent nilaisoal = new Intent(this,hasil.class);
		nilaisoal.putExtra("mHasil", mHasil);
		nilaisoal.putExtra("mJwb", jwaban);
		startActivity(nilaisoal);
		finish();
		System.exit(0);
		}	

@Override
public void onClick(View v) 
{
	// TODO Auto-generated method stub
	if(v.getId()==R.id.button1)
	{
		Intent i=new Intent(this,MainActivity.class);
		startActivity(i);
		finish();
	}
}

@Override
public void onClick1(View v) {
	// TODO Auto-generated method stub
	
}

}

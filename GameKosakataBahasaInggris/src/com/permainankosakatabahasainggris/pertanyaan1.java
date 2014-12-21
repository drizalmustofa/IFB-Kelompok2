package com.permainankosakatabahasainggris;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;



public class pertanyaan1 extends Activity implements OnClickListener 
{
	Button btn_jwb, btn_next;
	TextView salahbenar;
	EditText jawabannya;
	ImageView soal;
	int []pertanyaan =
		{R.drawable.terkejut,R.drawable.sedih,R.drawable.senang,R.drawable.tidakberwujud,
			R.drawable.accurate,R.drawable.afraid,R.drawable.amazing,R.drawable.angry};
	String [] jawaban =
		{"Shock","Sad","Happy","Abstract","Tepat","Takut","Menakjubkan","Marah"};
	int indeks = 0;
	int salah = 0 , benar = 0 ,
	skor = 0;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pertanyaan);
		soal = (ImageView)findViewById(R.id.GambarSoal);
				soal.setImageResource(pertanyaan[0]);
		salahbenar= (TextView)findViewById(R.id.salahbenar);
					btn_jwb = (Button)findViewById(R.id.jawab);
					btn_jwb.setOnClickListener(this);
					btn_next = (Button)findViewById(R.id.next);
					btn_next.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		salahbenar= (TextView)findViewById(R.id.salahbenar);
		jawabannya= (EditText)findViewById(R.id.jawabannya);
		if(v==btn_jwb)
		{
			String jawab1=jawabannya.getText().toString();
		if(jawab1.equalsIgnoreCase(jawaban[indeks]))
		{
			salahbenar.setText("Benar");
		benar++;
		}
	else
	{
		salahbenar.setText("Salah");
		salah++;
	}
		}
	else if
	(v==btn_next)
	{
		if(indeks<pertanyaan.length-1)
		{
			indeks++;
			soal.setImageResource(pertanyaan[indeks]);
			btn_jwb.setEnabled(true);
			btn_next.setVisibility(View.VISIBLE);
			jawabannya.setText("");
			salahbenar.setText("");
		}
		else
		{
			Intent i=new Intent(pertanyaan1.this,hasil.class);
			i.putExtra("Benar",benar);
			i.putExtra("Salah", salah);
			startActivity(i);
		}
		}
	}
}

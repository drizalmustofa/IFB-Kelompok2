package com.permainankosakatabahasainggris;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends Activity implements OnClickListener 
{
	TextView nilai;
	Button back;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hasil);
		int benar=getIntent().getIntExtra("Benar", 0);
		int salah=getIntent().getIntExtra("Salah", 0);
		nilai=(TextView)findViewById(R.id.hasil01);
		nilai.setText("jawaban benar :" + benar);
		back=(Button)findViewById(R.id.back);
		back.setOnClickListener(this);
	}
	public void onClick(View v)
	{
		if(v==back)
		{
			Intent i=new Intent(hasil.this,MainActivity.class);
			startActivity(i);
		}
	}

}

package com.permainankosakatabahasainggris;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class bantuan extends Activity implements onClickListener 
{
	protected void onCreate (Bundle savedInstanceState)
	{ 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bantuan);
	}


@Override
public void onClick1(View v) {
	// TODO Auto-generated method stub
	if(v.getId()==R.id.button1)
	{
		Intent i=new Intent(this,MainActivity.class);
		startActivity(i);
		finish();
}

}


@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
}}


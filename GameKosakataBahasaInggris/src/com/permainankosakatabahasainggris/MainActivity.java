package com.permainankosakatabahasainggris;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button pindah = (Button) findViewById(R.id.button1);
        pindah.setOnClickListener(new View.OnClickListener()
        {	
			@Override
			public void onClick(View v) {
				Intent i=new Intent (getApplicationContext(), kategori.class);
				startActivity(i);
				// TODO Auto-generated method stub
			}
		});
        Button ngalih = (Button) findViewById(R.id.button2);
        ngalih.setOnClickListener(new View.OnClickListener()
        {	
			@Override
			public void onClick(View v) {
				Intent i=new Intent (getApplicationContext(), bantuan.class);
				startActivity(i);
				// TODO Auto-generated method stub
			}
		});
        Button ngalih2 = (Button) findViewById(R.id.button3);
        ngalih2.setOnClickListener(new View.OnClickListener()
        {	
			@Override
			public void onClick(View v) {
				Intent i=new Intent (getApplicationContext(), tentang.class);
				startActivity(i);
				// TODO Auto-generated method stub
			}
		});
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

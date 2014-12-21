package com.permainankosakatabahasainggris;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class pertanyaan1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pertanyaan1);
        
        // tombol jawab
        Button jawab = (Button) findViewById(R.id.jawab);
        
        // tombol jawab diklik
        jawab.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// radio group
				RadioGroup opsi = (RadioGroup) findViewById(R.id.opsi);
				
				// radio yang dicek
				int id = opsi.getCheckedRadioButtonId();
				
				// dialog
				AlertDialog.Builder dialog = new AlertDialog.Builder(pertanyaan1.this);
				dialog.setCancelable(false);
				
				// tidak ada radio yang dicek
				if (id == -1) {
					// pesan error
					dialog.setTitle("Error");
					dialog.setMessage("Jawaban harus diisi.");
					dialog.setPositiveButton("OK", null);
					dialog.show();

				// ada radio yang dicek
				} else {
					// benar
					if (id == R.id.opsi1) {
						// intent
						final Intent intent = new Intent(pertanyaan1.this, pertanyaan2.class);
						
						// penjelasan
						dialog.setTitle("Benar");
						dialog.setMessage("Jawaban anda benar.");
						dialog.setPositiveButton("Berikutnya", new OnClickListener() {
							
							public void onClick(DialogInterface dialog, int which) {
								startActivity(intent);								
							}
						});
						dialog.show();
						
					// salah
					} else {
						// pesan salah
						dialog.setTitle("Salah");
						dialog.setMessage("Jawaban anda salah.");
						dialog.setPositiveButton("Ok", null);
						dialog.show();
					}
				}
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
package com.main.densitydial;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

import com.example.densitydial.R;
import com.main.densitydial.calculations;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void getLitres(){
		//Intent intent = new Intent (this, DisplayResults.class)
		//
		 TextView mLitreResults = new TextView(this);
		/* double mOrigVolume = 
		 double mOrigAbv = 
		 double mDesiredAbv = */
	
		 EditText mOrigVolText = (EditText) findViewById(R.id.current_volume);
		 EditText mOrigAbvText = (EditText) findViewById(R.id.current_abv);
		 EditText mDesiredAbvText = (EditText) findViewById(R.id.desired_abv);
		 
		 
		 double mOrigVolume = Double.parseDouble(mOrigVolText.getText().toString());
		 double mOrigAbv = Double.parseDouble(mOrigAbvText.getText().toString());
		 double mDesiredAbv = Double.parseDouble(mDesiredAbvText.getText().toString());
	
		 double mLitres = calculations.this.getLitresToAdd(mOrigVolume, mOrigAbv, mDesiredAbv);
		 
	}
	
	
	
	
	
	
	
	
	
}







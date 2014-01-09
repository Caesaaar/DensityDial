package com.main.densitydial;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.main.DensityDial.MESSAGE";
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

	public void getLitres(View view){
		
		
//		 TextView mLitreResults = new TextView(this);  
//		 mLitreResults.setTextSize(40);
//		 mLitreResults.setText(message);
//		 double mOrigVolume = 
//		 double mOrigAbv = 
//		 double mDesiredAbv = 
		 Intent intent = new Intent (this, DisplayResults.class);
		 EditText mOrigVolText = (EditText) findViewById(R.id.current_volume);
		 EditText mOrigAbvText = (EditText) findViewById(R.id.current_abv);
		 EditText mDesiredAbvText = (EditText) findViewById(R.id.desired_abv);
		 
		 
		 double mOrigVolume = Double.parseDouble(mOrigVolText.getText().toString());
		 double mOrigAbv = Double.parseDouble(mOrigAbvText.getText().toString());
		 double mDesiredAbv = Double.parseDouble(mDesiredAbvText.getText().toString());
	
		 calculations testcalc = new calculations();
		 double mLitres = testcalc.getLitresToAdd(mOrigVolume, mOrigAbv*10, mDesiredAbv*10);
		 
		 String mLitreResults = String.valueOf(mLitres);
		 intent.putExtra(EXTRA_MESSAGE, mLitreResults);
		 startActivity(intent);
		 
	}
	
	public void swipeView()
	{
		setContentView(R.layout.activity_litre_density_lookup);
	}
	
	
	
	
	
	
	
}







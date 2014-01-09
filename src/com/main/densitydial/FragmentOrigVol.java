package com.main.densitydial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentOrigVol extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_orig_vol, container, false);
	}

/*
  public EditText edit_txt = (EditText) findViewById(R.id.current_volume);

   edit_txt.setOnEditorActionListener(new EditText.OnEditorActionListener() 
           {
            @Override
            public boolean onEditorAction(TextView v, int actionId,
                    KeyEvent event) 
                {
                if (actionId == EditorInfo.IME_ACTION_DONE) 
                    {
                	// TODO do something
                    return true;
                    }
                return false;
                }
          });
	*/ 
	 
	
	
	
}

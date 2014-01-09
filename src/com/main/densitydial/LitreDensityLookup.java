package com.main.densitydial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class LitreDensityLookup extends FragmentActivity {

	ViewPager viewPager =null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_litre_density_lookup);
		viewPager = (ViewPager) findViewById(R.id.pager);
		FragmentManager fragmentManager = getSupportFragmentManager();
		viewPager.setAdapter (new MyAdapter(fragmentManager));
	
	
	
	}

}

class MyAdapter extends FragmentPagerAdapter
{
	public MyAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i){
		Fragment fragment=null;
		if (i==0)
		{
			fragment = new FragmentOrigVol();
		}
		if (i==1)
		{
			fragment = new FragmentEnterGravity();
		}
		if (i==2)
		{
			fragment = new FragmentViewResult();
		}
		return fragment;
	}
	
	@Override
	public int getCount() {
		return 3;
	}
}
	
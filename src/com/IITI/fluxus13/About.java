package com.IITI.fluxus13;

import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

public class About extends SherlockActivity {
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		 actionBar=getSupportActionBar();
		 actionBar.setTitle("About Us");
		
	}



}

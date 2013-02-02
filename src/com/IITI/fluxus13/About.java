package com.IITI.fluxus13;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

public class About extends SherlockActivity implements OnClickListener{
	ActionBar actionBar;
	TextView feed;
	TextView feedflux;
	TextView fbflux;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		 actionBar=getSupportActionBar();
		 actionBar.setTitle("About Us");
		 feed = (TextView) findViewById(R.id.tvFeedback);
		 feedflux = (TextView) findViewById(R.id.tvFeedbackFlux);
		 fbflux = (TextView) findViewById(R.id.tvFBFlux);
		 feed.setOnClickListener(this);
		 feedflux.setOnClickListener(this);
		 fbflux.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.tvFeedback:
			String emailadd[] = { "bkchaitan94@gmail.com" };
			Intent mail = new Intent(android.content.Intent.ACTION_SEND);
			mail.putExtra(android.content.Intent.EXTRA_EMAIL,
					emailadd);
			mail.putExtra(android.content.Intent.EXTRA_SUBJECT,
					"Feedback for Fluxus'13 Android App");
			mail.setType("plain/text");
			startActivity(mail);
			break;
		case R.id.tvFeedbackFlux:
			String emailaddflux[] = { "contactus@fluxus.in" };
			Intent mailu = new Intent(android.content.Intent.ACTION_SEND);
			mailu.putExtra(android.content.Intent.EXTRA_EMAIL,
					emailaddflux );
			mailu.putExtra(android.content.Intent.EXTRA_SUBJECT,
					"Feedback for Fluxus'13 Event");
			mailu.setType("plain/text");
			startActivity(mailu);
			break;
		case R.id.tvFBFlux:
			Intent fb = new Intent(Intent.ACTION_VIEW, Uri
					.parse("https://www.facebook.com/fluxus.iiti/"));
			startActivity(fb);
			break;
		
		}	}

}

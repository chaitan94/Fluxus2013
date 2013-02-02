package com.IITI.fluxus13;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class About extends Activity implements OnClickListener {

	TextView feed;
	TextView feedflux;
	TextView fbflux;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about);
		feed = (TextView) findViewById(R.id.tvFeedback);
		feedflux = (TextView) findViewById(R.id.tvFeedbackFlux);
		fbflux = (TextView) findViewById(R.id.tvFBFlux);
		feed.setOnClickListener(this);
		feedflux.setOnClickListener(this);
		fbflux.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
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
					.parse("http://www.fluxus.in"));
			startActivity(fb);
			break;
		}
	}

}

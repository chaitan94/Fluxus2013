package com.IITI.fluxus13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class About extends Activity implements OnClickListener{

	TextView feed;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about);
		feed = (TextView) findViewById(R.id.tvFeedback);
		feed.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent mail = new Intent(android.content.Intent.ACTION_SEND);
		mail.putExtra(android.content.Intent.EXTRA_EMAIL, "bkchaitan94@gmail.com");
		mail.putExtra(android.content.Intent.EXTRA_SUBJECT, "Feedback for Fluxus'13 Android App");
		mail.setType("plain/text");
		startActivity(mail);
	}

}

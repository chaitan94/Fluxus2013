package com.IITI.fluxus13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Home extends Activity {

	Button home;
	MyTextView enter;

	// HomeView bhew;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		// bhew = new HomeView(this);
		// setContentView(bhew);
		home = (Button) findViewById(R.id.bFlux);
		enter = (MyTextView) findViewById(R.id.bEnter);
		final Animation animScale = AnimationUtils.loadAnimation(this,
				R.anim.fluxscale);
		OnClickListener onEnter = new OnClickListener() {

			@Override
			public void onClick(View v) {
				home.startAnimation(animScale);
				Thread waitu = new Thread() {
					@Override
					public void run() {
						try {
							sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally {
							startActivity(new Intent("com.IITI.fluxus13.MAIN"));
							finish();
							overridePendingTransition(0,0);
						}
					}
				};
				waitu.start();
			}
		};
		home.setOnClickListener(onEnter);
		enter.setOnClickListener(onEnter);
	}
}

package com.IITI.fluxus13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try {
					sleep(1800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					startActivity(new Intent("com.IITI.fluxus13.HOME"));
//					startActivity(new Intent("com.IITI.fluxus13.MAIN"));
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
//		ImageView logo = (ImageView) findViewById(R.id.imageView1);
//		float x = logo.getX();
//		float u = 0;
//		logo.startAnimation(ag);
		super.onPause();
		finish();
	}
}
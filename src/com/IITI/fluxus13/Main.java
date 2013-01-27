package com.IITI.fluxus13;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class Main extends Activity {

	TabHost th;
	LinearLayout llEvents;
	LinearLayout llFluxus;
	ScrollView svFluxus;
	ImageView ivFluxus;
	ListView lvTechEvents;
	ListView lvCultEvents;
	ListView lvMaraEvents;
	ListView lvProEvents;
	ListView lvInformalEvents;
	ListView lvEventTypes;
	TextView tvFluxus1;
	TextView tvFluxus2;
	TextView tvFluxus3;
	TextView tvFluxus4;
	TextView tvFluxus5;
	TextView tvFluxus6;
	TextView tvFluxus7;
	TextView tvFluxus8;
	TextView tvFluxus9;
	TextView tvFluxus10;
	TextView tvFluxus11;
	TextView tvFluxus12;
	TextView tvFluxus13;
	int level = 0;
	int typeOfEvent = -1;
	String[] pro;

	// list anim
	int listP = 0;

	// swipe
	float a, b;
	int k = 0;

	protected void setupVars() {

		Typeface font = Typeface.createFromAsset(getAssets(),
				"Gotham Nights.ttf");

		llEvents = (LinearLayout) findViewById(R.id.llEvents);
		llFluxus = (LinearLayout) findViewById(R.id.llFluxus);
		svFluxus = (ScrollView) findViewById(R.id.svFluxus);
		ivFluxus = (ImageView) findViewById(R.id.ivFluxus);
		lvProEvents = (ListView) findViewById(R.id.lvProEvents);
		lvCultEvents = (ListView) findViewById(R.id.lvCultEvents);
		lvTechEvents = (ListView) findViewById(R.id.lvTechEvents);
		lvMaraEvents = (ListView) findViewById(R.id.lvMaraEvents);
		lvInformalEvents = (ListView) findViewById(R.id.lvInformalEvents);
		lvEventTypes = (ListView) findViewById(R.id.lvEventTypes);
		pro = getResources().getStringArray(R.array.proEvents);

		tvFluxus1 = (TextView) findViewById(R.id.tvFluxus1);
		tvFluxus2 = (TextView) findViewById(R.id.tvFluxus2);
		tvFluxus3 = (TextView) findViewById(R.id.tvFluxus3);
		tvFluxus4 = (TextView) findViewById(R.id.tvFluxus4);
		tvFluxus5 = (TextView) findViewById(R.id.tvFluxus5);
		tvFluxus6 = (TextView) findViewById(R.id.tvFluxus6);
		tvFluxus7 = (TextView) findViewById(R.id.tvFluxus7);
		tvFluxus8 = (TextView) findViewById(R.id.tvFluxus8);
		tvFluxus9 = (TextView) findViewById(R.id.tvFluxus9);
		tvFluxus10 = (TextView) findViewById(R.id.tvFluxus10);
		tvFluxus11 = (TextView) findViewById(R.id.tvFluxus11);
		tvFluxus12 = (TextView) findViewById(R.id.tvFluxus12);
		tvFluxus13 = (TextView) findViewById(R.id.tvFluxus13);

		th = (TabHost) findViewById(R.id.tabhost);
		th.setup();
		
		OnTouchListener tabSwipe = new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				k = th.getCurrentTab();
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					a = event.getX();
					break;
				case MotionEvent.ACTION_UP:
					b = event.getX();
					if (a-b > 20) {
						th.setCurrentTab(++k);
					}
					else if (b-a > 20) {
						th.setCurrentTab(--k);
					}
					break;
				}
				return true;
			}
		};

		llEvents.setFilterTouchesWhenObscured(false);
		llEvents.setOnTouchListener(tabSwipe);
		llFluxus.setFilterTouchesWhenObscured(false);
		llFluxus.setOnTouchListener(tabSwipe);

		llEvents.removeAllViews();
		llEvents.addView(lvEventTypes);

		TabSpec specs = th.newTabSpec("tag1");
		specs = th.newTabSpec("tag2");
		specs.setContent(R.id.svFluxus);
		specs.setIndicator("Fluxus");
		th.addTab(specs);
		specs = th.newTabSpec("tag1");
		specs.setContent(R.id.llEvents);
		specs.setIndicator("Events");
		th.addTab(specs);
		tvFluxus1.setText("IIT Indore's Techno-Cultural Fest");
		tvFluxus2
				.setText("An exceptional confluence of exquisite cultural displays with state-of-the-art technological innovations reverberating in an aura filled with excitement, amusement and splendour. Discover your indigenous creativity, set yourself astray from the usual monotonous life and delve into the trenches of exhilaration and entertainment.");
		tvFluxus3.setText("Overall Coordinators");
		tvFluxus4.setText("Arpit Jain ( +919826084568 )");
		tvFluxus5.setText("Jwalant Shah ( +918871749707 )");
		tvFluxus6.setText("Marketing Head");
		tvFluxus7.setText("Apoorv Goyal ( +918962447275 )");
		tvFluxus8.setText("Design Head");
		tvFluxus9.setText("Gagan Jakhotiya ( +919074888822 )");
		tvFluxus10.setText("Financing Head");
		tvFluxus11.setText("Rahul Pawar ( +917566569192 )");
		tvFluxus12.setText("Cultural Head");
		tvFluxus13.setText("Sachin Londhe ( +919179623390 )");
		tvFluxus4.setOnClickListener(call);
		tvFluxus5.setOnClickListener(call);
		tvFluxus7.setOnClickListener(call);
		tvFluxus9.setOnClickListener(call);
		tvFluxus11.setOnClickListener(call);
		tvFluxus13.setOnClickListener(call);
		ivFluxus.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri
						.parse("http://www.fluxus.in"));
				startActivity(browserIntent);
			}
		});

	}

	OnClickListener call = new OnClickListener() {

		public void onClick(View v) {

			String number = ((TextView) v).getText().toString();
			number = number.substring(number.indexOf("+91"),
					number.indexOf("+91") + 13);
			Intent intent = new Intent(Intent.ACTION_DIAL);
			intent.setData(Uri.parse("tel:" + number));
			startActivity(intent);

		}
	};

	OnItemClickListener listClick = new OnItemClickListener() {
		@SuppressWarnings("unchecked")
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			Bundle basket = new Bundle();
			String blah = ((AdapterView<ListAdapter>) arg1.getParent())
					.getItemAtPosition(position).toString();
			basket.putString("naam", blah);
			basket.putInt("typeEvent", typeOfEvent);
			basket.putInt("key", position);
			try {
				Class ourClass = Class.forName("com.IITI.fluxus13.EventDialog");
				Intent ourIntent = new Intent(Main.this, ourClass);
				ourIntent.putExtras(basket);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		final Animation fade = AnimationUtils.loadAnimation(this,
				R.anim.fade_in);
		final Animation listout = AnimationUtils.loadAnimation(this,
				R.anim.listout);
		final Animation listin = AnimationUtils.loadAnimation(this,
				R.anim.listin);
		setupVars();
		tvFluxus1.startAnimation(fade);
		tvFluxus2.startAnimation(fade);
		tvFluxus3.startAnimation(fade);
		tvFluxus4.startAnimation(fade);
		tvFluxus5.startAnimation(fade);
		tvFluxus6.startAnimation(fade);
		tvFluxus7.startAnimation(fade);
		tvFluxus8.startAnimation(fade);
		tvFluxus9.startAnimation(fade);
		tvFluxus10.startAnimation(fade);
		tvFluxus11.startAnimation(fade);
		tvFluxus12.startAnimation(fade);
		tvFluxus13.startAnimation(fade);
		lvProEvents.setOnItemClickListener(listClick);
		lvCultEvents.setOnItemClickListener(listClick);
		lvTechEvents.setOnItemClickListener(listClick);
		lvInformalEvents.setOnItemClickListener(listClick);
		lvMaraEvents.setOnItemClickListener(listClick);
		lvEventTypes.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				level = 1;
				lvEventTypes.startAnimation(listout);
				llEvents.removeAllViews();
				typeOfEvent = position;
				switch (position) {
				case 0:
					lvProEvents.startAnimation(listin);
					llEvents.addView(lvProEvents);
					break;
				case 1:
					lvCultEvents.startAnimation(listin);
					llEvents.addView(lvCultEvents);
					break;
				case 2:
					lvTechEvents.startAnimation(listin);
					llEvents.addView(lvTechEvents);
					break;
				case 3:
					lvInformalEvents.startAnimation(listin);
					llEvents.addView(lvInformalEvents);
					break;
				case 4:
					lvMaraEvents.startAnimation(listin);
					llEvents.addView(lvMaraEvents);
					break;
				}
			}
		});

	}

	@Override
	public void onBackPressed() {
		final Animation listoutrev = AnimationUtils.loadAnimation(this,
				R.anim.listoutrev);
		final Animation listinrev = AnimationUtils.loadAnimation(this,
				R.anim.listinrev);
		if (level == 1) {
			switch (typeOfEvent) {
			case 0:
				lvProEvents.startAnimation(listoutrev);
				llEvents.removeView(lvProEvents);
				break;
			case 1:
				lvCultEvents.startAnimation(listoutrev);
				llEvents.removeView(lvCultEvents);
				break;
			case 2:
				lvTechEvents.startAnimation(listoutrev);
				llEvents.removeView(lvTechEvents);
				break;
			case 3:
				lvInformalEvents.startAnimation(listoutrev);
				llEvents.removeView(lvInformalEvents);
				break;
			case 4:
				lvMaraEvents.startAnimation(listoutrev);
				llEvents.removeView(lvMaraEvents);
				break;
			}
			lvEventTypes.startAnimation(listinrev);
			llEvents.addView(lvEventTypes);
			level = 0;
		} else {
			new AlertDialog.Builder(this)
					.setIcon(android.R.drawable.ic_dialog_alert)
					.setMessage("Do you want to exit?")
					.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									finish();
								}

							}).setNegativeButton("No", null).show();
		}
		return;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.aboutUs:
			startActivity(new Intent("com.IITI.fluxus13.ABOUT"));
			break;
		}
		return false;
	}

}

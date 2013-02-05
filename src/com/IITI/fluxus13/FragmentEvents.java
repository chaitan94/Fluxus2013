package com.IITI.fluxus13;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentEvents extends SherlockFragment {
	static LinearLayout llEvents;

	static ListView lvTechEvents;
	static ListView lvCultEvents;
	static ListView lvMaraEvents;
	static ListView lvProEvents;
	static ListView lvInformalEvents;
	static ListView lvWorkshops;
	static ListView lvEventTypes;

	static int level = 0;
	static int typeOfEvent = -1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater
				.inflate(R.layout.fragment_events, container, false);
		setupVars(view);
		lvProEvents.setOnItemClickListener(listClick);
		lvCultEvents.setOnItemClickListener(listClick);
		lvTechEvents.setOnItemClickListener(listClick);
		lvInformalEvents.setOnItemClickListener(listClick);
		lvMaraEvents.setOnItemClickListener(listClick);
		lvWorkshops.setOnItemClickListener(listClick);
		final Animation listin = AnimationUtils.loadAnimation(
				view.getContext(), R.anim.listin);
		final Animation listoutrev = AnimationUtils.loadAnimation(
				view.getContext(), R.anim.listoutrev);
		lvEventTypes.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				if (typeOfEvent != position) {
					if (level == 1) {
						llEvents.getChildAt(1).startAnimation(listoutrev);
						llEvents.removeViewAt(1);
					}
					level = 1;
					typeOfEvent = position;
					switch (position) {
					case 0:
						llEvents.addView(lvProEvents);
						lvProEvents.startAnimation(listin);
						break;
					case 1:
						llEvents.addView(lvCultEvents);
						lvCultEvents.startAnimation(listin);
						break;
					case 2:
						llEvents.addView(lvTechEvents);
						lvTechEvents.startAnimation(listin);
						break;
					case 3:
						llEvents.addView(lvInformalEvents);
						lvInformalEvents.startAnimation(listin);
						break;
					case 4:
						llEvents.addView(lvMaraEvents);
						lvMaraEvents.startAnimation(listin);
						break;
					case 5:
						llEvents.addView(lvWorkshops);
						lvWorkshops.startAnimation(listin);
						break;
					}
				}
			}
		});
		return view;
	}

	protected void setupVars(View view) {

		llEvents = (LinearLayout) view.findViewById(R.id.llEvents);

		lvProEvents = (ListView) view.findViewById(R.id.lvProEvents);
		lvCultEvents = (ListView) view.findViewById(R.id.lvCultEvents);
		lvTechEvents = (ListView) view.findViewById(R.id.lvTechEvents);
		lvMaraEvents = (ListView) view.findViewById(R.id.lvMaraEvents);
		lvInformalEvents = (ListView) view.findViewById(R.id.lvInformalEvents);
		lvEventTypes = (ListView) view.findViewById(R.id.lvEventTypes);
		lvWorkshops = (ListView) view.findViewById(R.id.lvWorkshops);
		llEvents.removeAllViews();
		llEvents.addView(lvEventTypes);

	}

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
				Intent ourIntent = new Intent(arg0.getContext(), ourClass);
				ourIntent.putExtras(basket);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	};

	public static void onBack(Animation listoutrev) {
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
		case 5:
			lvWorkshops.startAnimation(listoutrev);
			llEvents.removeView(lvWorkshops);
			break;
		}
		level = 0;
	}

}

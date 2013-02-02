package com.IITI.fluxus13;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentEvents extends SherlockFragment {
	static LinearLayout llEvents;

	ListView lvTechEvents;
	ListView lvCultEvents;
	ListView lvMaraEvents;
	ListView lvProEvents;
	ListView lvInformalEvents;
	static ListView lvEventTypes;

	static int level = 0;
	int typeOfEvent = -1;

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
		lvEventTypes.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				level = 1;
				llEvents.removeAllViews();
				typeOfEvent = position;
				switch (position) {
				case 0:
					llEvents.addView(lvProEvents);
					break;
				case 1:
					llEvents.addView(lvCultEvents);
					break;
				case 2:
					llEvents.addView(lvTechEvents);
					break;
				case 3:
					llEvents.addView(lvInformalEvents);
					break;
				case 4:
					llEvents.addView(lvMaraEvents);
					break;
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

}

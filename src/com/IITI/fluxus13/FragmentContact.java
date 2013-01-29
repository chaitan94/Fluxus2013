package com.IITI.fluxus13;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentContact extends SherlockFragment {
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
	
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
              Bundle savedInstanceState)
{
      View view = inflater.inflate(R.layout.fragment_contact, container, false);
      setupVars(view);
      final Animation fade = AnimationUtils.loadAnimation(view.getContext(),
				R.anim.fade_in);
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
      return view;}
	  
	  protected void setupVars(View view){
		  tvFluxus3 = (TextView) view.findViewById(R.id.tvFluxus3);
			tvFluxus4 = (TextView) view.findViewById(R.id.tvFluxus4);
			tvFluxus5 = (TextView) view.findViewById(R.id.tvFluxus5);
			tvFluxus6 = (TextView)view.findViewById(R.id.tvFluxus6);
			tvFluxus7 = (TextView) view.findViewById(R.id.tvFluxus7);
			tvFluxus8 = (TextView) view.findViewById(R.id.tvFluxus8);
			tvFluxus9 = (TextView) view.findViewById(R.id.tvFluxus9);
			tvFluxus10 = (TextView) view.findViewById(R.id.tvFluxus10);
			tvFluxus11 = (TextView) view.findViewById(R.id.tvFluxus11);
			tvFluxus12 = (TextView) view.findViewById(R.id.tvFluxus12);
			tvFluxus13 = (TextView) view.findViewById(R.id.tvFluxus13);
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
}


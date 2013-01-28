package com.IITI.fluxus13;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentFluxus extends SherlockFragment {
	ImageView ivFluxus;
	TextView tvFluxus1;
	TextView tvFluxus2;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                    Bundle savedInstanceState)
    {
            View view = inflater.inflate(R.layout.fragment_fluxus, container, false);
            setupVars(view);
            return view;
    }
	protected void setupVars(View view){
	ivFluxus = (ImageView) view.findViewById(R.id.ivFluxus);
	tvFluxus1 = (TextView) view.findViewById(R.id.tvFluxus1);
	tvFluxus2 = (TextView) view.findViewById(R.id.tvFluxus2);
	
	tvFluxus1.setText("IIT Indore's Techno-Cultural Fest");
	tvFluxus2.setText(getResources().getString(R.string.summary));
	
	ivFluxus.setOnClickListener(new OnClickListener() {

		public void onClick(View v) {
			Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri
					.parse("http://www.fluxus.in"));
			startActivity(browserIntent);
		}
	});
	
	}
	
	}



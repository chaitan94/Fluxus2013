package com.IITI.fluxus13;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView extends TextView{

	public MyTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
		// TODO Auto-generated constructor stub
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
		// TODO Auto-generated constructor stub
	}

	public MyTextView(Context context) {
		super(context);
		init();
		// TODO Auto-generated constructor stub
	}

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                                               "Gotham Nights.ttf");
        setTypeface(tf);
    }
}

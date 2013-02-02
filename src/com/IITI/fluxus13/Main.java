package com.IITI.fluxus13;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class Main extends SherlockFragmentActivity {
	ActionBar actionBar;
	 ViewPager mViewPager;
     TabsAdapter mTabsAdapter;
	
		FragmentEvents fe;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mViewPager = new ViewPager(this); 
        mViewPager.setId(R.id.pager);
        setContentView(mViewPager);
        actionBar=getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        mTabsAdapter = new TabsAdapter(this, mViewPager);

        mTabsAdapter.addTab(
                        actionBar.newTab().setText("Fluxus"),
                        FragmentFluxus.class, null);
        mTabsAdapter.addTab(actionBar.newTab().setText("Events"),
                        FragmentEvents.class, null);
        mTabsAdapter.addTab(
                actionBar.newTab().setText("Contact"),
                FragmentContact.class, null);
		

	}
	public static class TabsAdapter extends FragmentPagerAdapter implements
    ActionBar.TabListener, ViewPager.OnPageChangeListener
{
private final Context mContext;
private final ActionBar mActionBar;
private final ViewPager mViewPager;
private final ArrayList<TabInfo> mTabs = new ArrayList<TabInfo>();

static final class TabInfo
{
    private final Class<?> clss;
    private final Bundle args;

    TabInfo(Class<?> _class, Bundle _args)
    {
            clss = _class;
            args = _args;
    }
}

public TabsAdapter(SherlockFragmentActivity activity, ViewPager pager)
{
    super(activity.getSupportFragmentManager());
    mContext = activity;
    mActionBar = activity.getSupportActionBar();
    mViewPager = pager;
    mViewPager.setAdapter(this);
    mViewPager.setOnPageChangeListener(this);
}

public void addTab(ActionBar.Tab tab, Class<?> clss, Bundle args)
{
    TabInfo info = new TabInfo(clss, args);
    tab.setTag(info);
    tab.setTabListener(this);
    mTabs.add(info);
    mActionBar.addTab(tab);
    notifyDataSetChanged();
}

@Override
public int getCount()
{
    return mTabs.size();
}

@Override
public Fragment getItem(int position)
{
    TabInfo info = mTabs.get(position);
    return Fragment.instantiate(mContext, info.clss.getName(),
                    info.args);
}

public void onPageScrolled(int position, float positionOffset,
            int positionOffsetPixels)
{
}

public void onPageSelected(int position)
{
    mActionBar.setSelectedNavigationItem(position);
}

public void onPageScrollStateChanged(int state)
{
}

public void onTabSelected(Tab tab, FragmentTransaction ft)
{
    Object tag = tab.getTag();
    for (int i = 0; i < mTabs.size(); i++)
    {
            if (mTabs.get(i) == tag)
            {
                    mViewPager.setCurrentItem(i);
            }
    }
}

public void onTabUnselected(Tab tab, FragmentTransaction ft)
{
}

public void onTabReselected(Tab tab, FragmentTransaction ft)
{
}
}
@Override	
public void onBackPressed(){
	 
	final Animation listoutrev = AnimationUtils.loadAnimation(this,
			R.anim.listoutrev);
	final Animation listinrev = AnimationUtils.loadAnimation(this,
			R.anim.listinrev);
	if (FragmentEvents.level == 1&&actionBar.getSelectedTab().getPosition()==1) {
	FragmentEvents.onBack(listoutrev, listinrev);
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
		MenuInflater inflater=getSupportMenuInflater();
				inflater.inflate(R.menu.activity_main, menu);
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

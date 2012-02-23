package jp.senchan.wasadroid.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import jp.senchan.lib.ui.BaseActivity;
import jp.senchan.wasadroid.R;
import jp.senchan.wasadroid.ui.adapter.HomePagerAdapter;

public class HomeActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		ViewPager pagerHome = (ViewPager) findViewById(R.id.pager_home);
		pagerHome.setAdapter(new HomePagerAdapter(getSupportFragmentManager()));
	}
}

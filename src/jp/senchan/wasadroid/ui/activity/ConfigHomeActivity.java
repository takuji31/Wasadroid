package jp.senchan.wasadroid.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import jp.senchan.lib.ui.BaseActivity;
import jp.senchan.wasadroid.R;
import jp.senchan.wasadroid.listener.OnPageTypeSelectListener;
import jp.senchan.wasadroid.ui.fragment.ConfigPageFragment;
import jp.senchan.wasadroid.ui.fragment.PageTypesFragment;

public class ConfigHomeActivity extends BaseActivity implements OnPageTypeSelectListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.config_home);
		
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		ft.add(R.id.container, new PageTypesFragment());
	}

	@Override
	public void onPageTypeSelect(String type) {
		// TODO Auto-generated method stub
		Fragment f = new ConfigPageFragment();
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.container, f);
		ft.addToBackStack(null);
		ft.commit();
	}
}

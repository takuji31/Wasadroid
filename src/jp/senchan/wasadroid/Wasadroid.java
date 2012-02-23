package jp.senchan.wasadroid;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.res.Resources;

import jp.senchan.lib.BaseApp;

public class Wasadroid extends BaseApp {
	
	public ArrayList<String> pageTypeNames;
	public ArrayList<String> pageTypes;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Resources res = getResources();
		pageTypeNames = (ArrayList<String>) Arrays.asList(res.getStringArray(R.array.page_types_name));
		pageTypes = (ArrayList<String>) Arrays.asList(res.getStringArray(R.array.page_types));
	}
	@Override
	public int getDefaultPrefVersion() {
		// TODO Auto-generated method stub
		return 1;
	}

}

package jp.senchan.wasadroid.ui.fragment;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import jp.senchan.lib.ui.BaseListFragment;
import jp.senchan.wasadroid.R;
import jp.senchan.wasadroid.Wasadroid;
import jp.senchan.wasadroid.listener.OnPageTypeSelectListener;

public class PageTypesFragment extends BaseListFragment{
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Wasadroid app = (Wasadroid) app();
		setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, app.pageTypeNames));
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Wasadroid app = (Wasadroid) app();
		String type = app.pageTypes.get(position);
		((OnPageTypeSelectListener)(getActivity())).onPageTypeSelect(type);
	}

}

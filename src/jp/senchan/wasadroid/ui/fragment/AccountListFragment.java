package jp.senchan.wasadroid.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import jp.senchan.lib.ui.BaseFragment;
import jp.senchan.wasadroid.R;
import jp.senchan.wasadroid.ui.adapter.WasadroidBaseAdapter;

public class AccountListFragment extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.account_list, null);
		ListView listAccountList = (ListView) v.findViewById(R.id.account_list);
		listAccountList.setAdapter(new WasadroidBaseAdapter(getActivity(), 0, null));
		return v;
	}
}

package jp.senchan.wasadroid.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.LinearLayout;
import android.widget.TableLayout.LayoutParams;
import jp.senchan.lib.ui.BaseActivity;
import jp.senchan.wasadroid.R;
import jp.senchan.wasadroid.ui.fragment.AccountListFragment;

public class AccountListActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account);
	}
}

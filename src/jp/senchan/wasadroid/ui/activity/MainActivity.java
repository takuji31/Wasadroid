package jp.senchan.wasadroid.ui.activity;

import jp.senchan.lib.ui.BaseActivity;
import jp.senchan.wasadroid.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button accountList = (Button) findViewById(R.id.button_account_list);
        accountList.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AccountListActivity.class);
				startActivity(intent);
			}
		});
        Button home = (Button) findViewById(R.id.button_home);
        home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, HomeActivity.class);
				startActivity(intent);
			}
		});
        Button configHome = (Button) findViewById(R.id.button_config_home);
        configHome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ConfigHomeActivity.class);
				startActivity(intent);
			}
		});
    }
}
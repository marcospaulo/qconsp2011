package br.com.delxmobile.qconsp.activities;

import android.app.Activity;
import android.os.Bundle;
import br.com.delxmobile.qconsp.R;
import br.com.delxmobile.qconsp.util.ActivityHelper;

public class DashboardActivity extends Activity {
	

	ActivityHelper mActivityHelper = ActivityHelper.createInstance(this);
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        
        mActivityHelper.setupActionBar(null);
        
        
    }
}
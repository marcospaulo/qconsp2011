package br.com.delxmobile.qconsp.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import br.com.delxmobile.qconsp.R;
import br.com.delxmobile.qconsp.util.ActivityHelper;

public class Local extends Activity {


	ActivityHelper mActivityHelper = ActivityHelper.createInstance(this);

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.local);

		mActivityHelper.setupActionBar("Local");

		//Sábado
		Button mapa = (Button) findViewById(R.id.mapa);
		mapa.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Uri uri = Uri.parse("http://g.co/maps/vj3zw");
				startActivity(new Intent(Intent.ACTION_VIEW, uri));
			}
		}); 

	}

}
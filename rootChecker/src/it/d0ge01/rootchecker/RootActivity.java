package it.d0ge01.rootchecker;

import com.stericson.RootTools.RootTools;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RootActivity extends Activity {
	private ImageView rootim;
	private ImageView busyim;
	private ImageView acceim;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_root);
		
		rootim = (ImageView) findViewById(R.id.rootim);
		busyim = (ImageView) findViewById(R.id.busyim);
		acceim = (ImageView) findViewById(R.id.accessim);
		
		sendMex("Testing for root..");
		
		if(RootTools.isRootAvailable()){
			rootim.setImageResource(R.drawable.yes);
			if(RootTools.isAccessGiven()) {
				acceim.setImageResource(R.drawable.yes);
			}
			if(RootTools.isBusyboxAvailable()) {
				busyim.setImageResource(R.drawable.yes);
			}
		}
		if(RootTools.isBusyboxAvailable()) {
			busyim.setImageResource(R.drawable.yes);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.root, menu);
		return true;
	}

	public void sendMex(String message){

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}

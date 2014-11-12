package com.example.myproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myproject.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class LandingActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_landing);
		
		ImageView imgView = (ImageView) findViewById(R.id.avatar_img);
		
		imgView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Test click 123", Toast.LENGTH_LONG).show();
				showPlayer();
			}
		});

	}
	
	public void showPlayer()
	{
		Intent intent = new Intent(getBaseContext(),PlayerActivity.class);
		startActivity(intent);
	}
}

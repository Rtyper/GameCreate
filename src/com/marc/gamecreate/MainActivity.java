package com.marc.gamecreate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void playGame(Context context){
		Intent playintent = new Intent(this, PlayActivity.class);
		startActivity(playintent);
	}
	
	public void editGame(Context context){
		Intent editintent = new Intent(this, EditActivity.class);
		startActivity(editintent);
	}

	public void createGame(Context context){
		Intent createintent = new Intent(this, CreateActivity.class);
		startActivity(createintent);
	}

}

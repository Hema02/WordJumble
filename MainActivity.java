package com.example.randomproject;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RandomActivity extends Activity {
  public static String EXTRA_MSG="com.example.activityswitcher.MESSAGE";
	Button btnjump;
	EditText randomedit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_random);
		randomedit=(EditText)findViewById(R.id.editText1);
		btnjump=(Button)findViewById(R.id.button1);
		
	}
	public void Sendmsg(View view)
	{
		Intent intent = new Intent(this,ActivitySide2.class);
		String temp=randomedit.getText().toString();
		intent.putExtra(EXTRA_MSG,temp);
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.random, menu);
		return true;
	}

}

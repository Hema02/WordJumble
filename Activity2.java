package com.example.randomproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class ActivitySide2 extends Activity {
  TextView randomtxtresult;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_side2);
		randomtxtresult=(TextView) findViewById(R.id.textView2);
		Intent intent1=getIntent();
		String names=intent1.getStringExtra(RandomActivity.EXTRA_MSG);
		char[] charArray = names.toCharArray();
		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i < charArray.length; i++) {
			 list1.add(Character.toString(charArray[i]));
		 }
		Collections.shuffle(list1);
		randomtxtresult.setText(list1.toString());
		String resultName="";
		for(int i=0;i<list1.size();i++){
			resultName +=list1.get(i);
		}
		randomtxtresult.setText("The scrambled text is " + resultName);
		}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_side2, menu);
		return true;
	}

}

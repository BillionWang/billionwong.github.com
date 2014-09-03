package com.example.news;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewContent extends Activity {
	private TextView tvContent;
	private TextView tvTitle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_content);
		tvContent = (TextView) findViewById(R.id.content_tv);
		tvTitle = (TextView)findViewById(R.id.title_tv);
		Intent intent = getIntent();
		tvTitle.setText(intent.getStringExtra("title"));
		tvContent.setText(intent.getStringExtra("content"));
		
	}
	
}

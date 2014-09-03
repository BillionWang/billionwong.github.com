package com.example.news;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NewAdapter extends ArrayAdapter<News> {
	
	private int resoursId;
	public NewAdapter(Context context, int resource, List<News> objects) {
		super(context, resource, objects);
		resoursId = resource;
		// TODO Auto-generated constructor stub
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		News news = getItem(position);
		View view;
		if(convertView ==null){
			view  = LayoutInflater.from(getContext()).inflate(resoursId, null,false);
			
		}
		else {
			view = convertView;
			
		}
		
		TextView tvTitle = (TextView) view.findViewById(R.id.tv1);
		tvTitle.setText(news.getTitle());
		return view;
	}
	
	
}

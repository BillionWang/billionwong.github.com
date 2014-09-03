package com.example.news;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
	List<News> newsList = new ArrayList<News>();
	private ListView lvView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitNews();
        lvView = (ListView) findViewById(R.id.listView1);
        lvView.setAdapter(new NewAdapter(this, R.layout.new_title, newsList));
        lvView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				Intent intent = new Intent(MainActivity.this,NewContent.class);
				intent.putExtra("title",newsList.get(arg2).getTitle());
				intent.putExtra("content", newsList.get(arg2).getContent());
				startActivity(intent);
				
				// TODO Auto-generated method stub
				
			}
		});
        
        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }


    private void InitNews()
    {
    	News news1 = new News("Ì«²Ö±¬Õ¨", "Ì«²ÖÓÐ³¬¼¶´ó±¬Õ¨");
    	newsList.add(news1);
    	
    	News news2 = new News("Îäºº¶Â³µ","Îäºº´ó¶Â³µ");
    	newsList.add(news2);
    }
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    *//**
     * A placeholder fragment containing a simple view.
     *//*
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }*/

}

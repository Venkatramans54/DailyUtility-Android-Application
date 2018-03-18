package com.example.dailyutility.nutrients;

import com.example.dailyutility.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomList2 extends ArrayAdapter<String> {
	public final Activity context;
	private final String[] web;
	public CustomList2(Activity context,String[] web) {
	super(context, R.layout.activity_nutrientslistitems, web);
	this.context = context;
	this.web = web;
	}
	@Override
	public View getView(int position, View view, ViewGroup parent) {
	LayoutInflater inflater = context.getLayoutInflater();
	View rowView= inflater.inflate(R.layout.activity_nutrientslistitems, null, true);
	TextView txtTitle = (TextView) rowView.findViewById(R.id.textViewnutri);
	txtTitle.setText(web[position]);
	return rowView;
	}

}

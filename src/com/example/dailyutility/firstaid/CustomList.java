package com.example.dailyutility.firstaid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dailyutility.R;

public class CustomList extends ArrayAdapter<String>{
	public final Activity context;
	private final String[] web;
	public CustomList(Activity context,String[] web) {
	super(context, R.layout.activity_firstaidlistitems, web);
	this.context = context;
	this.web = web;
	}
	@Override
	public View getView(int position, View view, ViewGroup parent) {
	LayoutInflater inflater = context.getLayoutInflater();
	View rowView= inflater.inflate(R.layout.activity_firstaidlistitems, null, true);
	TextView txtTitle = (TextView) rowView.findViewById(R.id.textfaView1);
	txtTitle.setText(web[position]);
	return rowView;
	}
	}


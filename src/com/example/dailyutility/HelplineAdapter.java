package com.example.dailyutility;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class HelplineAdapter extends ArrayAdapter<String> {
	
	public final Activity context;
	private final String[] web;
	private final String[] number;
	
	public HelplineAdapter(Activity context, String[] web,String[] number) {
		super(context, R.layout.activity_helplineitems, web);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.web = web;
		this.number = number;
	}

	
	@Override
	public View getView(int position, View view, ViewGroup parent) {
	LayoutInflater inflater = context.getLayoutInflater();
	View rowView= inflater.inflate(R.layout.activity_helplineitems, null, true);
	TextView t1 = (TextView) rowView.findViewById(R.id.textViewname1);
	TextView t2 = (TextView) rowView.findViewById(R.id.textViewnumber2);
	t1.setText(web[position]);
	t2.setText(number[position]);
	return rowView;
	}

}

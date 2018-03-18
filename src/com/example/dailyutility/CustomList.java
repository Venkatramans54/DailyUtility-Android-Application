package com.example.dailyutility;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
	public final Activity context;
	private final String[] module;
	private final Integer[] imageId;
	public CustomList(Activity context,String[] module, Integer[] imageId) {
	super(context, R.layout.list_items, module);
	this.context = context;
	this.module = module;
	this.imageId = imageId;
}
	@Override
	public View getView(int position, View view, ViewGroup parent) {
	LayoutInflater inflater = context.getLayoutInflater();
	View rowView= inflater.inflate(R.layout.list_items, null, true);
	TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
	ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
	txtTitle.setText(module[position]);
	imageView.setImageResource(imageId[position]);
	return rowView;
	}
}

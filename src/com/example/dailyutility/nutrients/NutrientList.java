package com.example.dailyutility.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dailyutility.MainActivity;
import com.example.dailyutility.R;
import com.example.dailyutility.firstaid.CustomList;

public class NutrientList extends MainActivity {
	
	ListView list;
	  String[] web = {"What are Nutrients?",
			  "Carbohydrates",
			  "Proteins",
			  "Fats",
			  "Water",
			  "Vitamins",
			  "Minerals",
			  "Calcium",
			  "Sodium",
			  "Potassium"
	  } ;
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_nutrientslist);
	        CustomList a = new CustomList(NutrientList.this,web);
		    list=(ListView)findViewById(R.id.listViewnutrients);
		    list.setAdapter(a);
		    list.setOnItemClickListener(new aaaa());
	 }
	  public class aaaa implements OnItemClickListener
	  {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			// TODO Auto-generated method stub
			Toast.makeText(NutrientList.this, web[+ position], Toast.LENGTH_SHORT).show();
			if(position==0){
				Intent i=new Intent(getApplicationContext(),N1.class);
				startActivity(i);
			}
			if(position==1){
				Intent i=new Intent(getApplicationContext(),N2.class);
				startActivity(i);
			}
			if(position==2){
				Intent i=new Intent(getApplicationContext(),N3.class);
				startActivity(i);
			}
			if(position==3){
				Intent i=new Intent(getApplicationContext(),N4.class);
				startActivity(i);
			}
			if(position==4){
				Intent i=new Intent(getApplicationContext(),N5.class);
				startActivity(i);
			}
			if(position==5){
				Intent i=new Intent(getApplicationContext(),N6.class);
				startActivity(i);
			}
			if(position==6){
				Intent i=new Intent(getApplicationContext(),N7.class);
				startActivity(i);
			}
			if(position==7){
				Intent i=new Intent(getApplicationContext(),N8.class);
				startActivity(i);
			}
			if(position==8){
				Intent i=new Intent(getApplicationContext(),N9.class);
				startActivity(i);
			}
			if(position==9){
				Intent i=new Intent(getApplicationContext(),N10.class);
				startActivity(i);
			}
		}
	}

}

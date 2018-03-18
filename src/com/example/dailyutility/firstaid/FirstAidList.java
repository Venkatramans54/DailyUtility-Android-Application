package com.example.dailyutility.firstaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dailyutility.MainActivity;
import com.example.dailyutility.R;

public class FirstAidList extends MainActivity {
	ListView list;
	  String[] web = {"OSHA Guidelines",
			  "Burns",
			  "Fractures, Sprains and Strains",
			  "Breathing Problems and Choking",
			  "Bleeding, Cuts and Scrapes",
			  "Non-Bleeding Wounds",
			  "Nosebleeding",
			  "Head, Neck and Spine Injury",
			  "Asthma",
			  "Wheezing",
			  "Snake Bites",
			  "Heart Attacks"
	  } ;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_firstaidlist);
	        CustomList a = new CustomList(FirstAidList.this,web);
		    list=(ListView)findViewById(R.id.listfaView1);
		    list.setAdapter(a);
		    list.setOnItemClickListener(new aaa());
	 }
	 
	 public class aaa implements OnItemClickListener
	  {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			// TODO Auto-generated method stub
			Toast.makeText(FirstAidList.this, web[+ position], Toast.LENGTH_SHORT).show();
			if(position==0){
				Intent i=new Intent(getApplicationContext(),F1.class);
				startActivity(i);
			}
			if(position==1){
				Intent i=new Intent(getApplicationContext(),F2.class);
				startActivity(i);
			}
			if(position==2){
				Intent i=new Intent(getApplicationContext(),F3.class);
				startActivity(i);
			}
			if(position==3){
				Intent i=new Intent(getApplicationContext(),F4.class);
				startActivity(i);
			}
			if(position==4){
				Intent i=new Intent(getApplicationContext(),F5.class);
				startActivity(i);
			}
			if(position==5){
				Intent i=new Intent(getApplicationContext(),F6.class);
				startActivity(i);
			}
			if(position==6){
				Intent i=new Intent(getApplicationContext(),F7.class);
				startActivity(i);
			}
			if(position==7){
				Intent i=new Intent(getApplicationContext(),F8.class);
				startActivity(i);
			}
			if(position==8){
				Intent i=new Intent(getApplicationContext(),F9.class);
				startActivity(i);
			}
			if(position==9){
				Intent i=new Intent(getApplicationContext(),F10.class);
				startActivity(i);
			}
			if(position==10){
				Intent i=new Intent(getApplicationContext(),F11.class);
				startActivity(i);
			}
			if(position==11){
				Intent i=new Intent(getApplicationContext(),F12.class);
				startActivity(i);
			}
		}
		  
	  }

}

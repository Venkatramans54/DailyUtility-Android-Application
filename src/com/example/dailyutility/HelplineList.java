package com.example.dailyutility;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class HelplineList extends MainActivity {
	
	ListView list;
	  String[] web = {
	      "Police",
	      "Fire Emergency",
	      "Ambulance",
	      "Disaster Management",
	      "Woman Helpline",
	      "Woman Helpline(Domestic Abuse)",
	      "Air Ambulance",
	      "Aids Helpline",
	      "Missing Child",
	      "Railway Enquiry",
	      "Senior Citizen Helpline",
	      "Railway Accident Emergency",
	      "Roadway Accident Emergency",
	      "Kisan Call Center",
	      "Natural Calamities",
	      "Children in Difficult Situation",
	      "Central Vigilance Commission",
	      "Indian Railway Security Helpline",
	  } ;
	  String[] number = {
	      "100",
	      "101",
	      "102",
	      "108",
	      "1091",
	      "181",
	      "9540161344",
	      "1097",
	      "1094",
	      "139",
	      "1091",
	      "1072",
	      "1073",
	      "1551",
	      "1070",
	      "1098",
	      "1964",
	      "1322",
	  } ;
	
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_helpline);
	      HelplineAdapter a = new HelplineAdapter(HelplineList.this,web,number);
		  list=(ListView)findViewById(R.id.listView001);
		  list.setAdapter(a);
		  list.setOnItemClickListener(new Call());
	}
	
	public class Call implements OnItemClickListener
	  {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			// TODO Auto-generated method stub
			Toast.makeText(HelplineList.this, web[+ position], Toast.LENGTH_SHORT).show();
			Intent i = new Intent(Intent.ACTION_CALL);
			i.setData(Uri.parse("tel:"+number[+position]));
			startActivity(i);

		}
		  
	  }

}

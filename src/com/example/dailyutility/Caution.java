package com.example.dailyutility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Caution extends Activity {
	
	Button b1;
	@Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_caution);
	      b1=(Button)findViewById(R.id.button1);
	      
	      b1.setOnClickListener(new View.OnClickListener() {
		         @Override
		         public void onClick(View v) {
		        	 Intent i=new Intent(getApplicationContext(),MainActivity.class);
					 startActivity(i); 
		         }
		      });
		   }
}

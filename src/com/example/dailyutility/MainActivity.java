package com.example.dailyutility;


import com.example.dailyutility.firstaid.FirstAidList;
import com.example.dailyutility.nutrients.NutrientList;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.Button1);
        b2=(Button) findViewById(R.id.Button2);
        b3=(Button) findViewById(R.id.Button3);
        b4=(Button) findViewById(R.id.Button4);
        b5=(Button) findViewById(R.id.Button5);
        b6=(Button) findViewById(R.id.Button6);
        b7=(Button) findViewById(R.id.Button7);
        b8=(Button) findViewById(R.id.Button8);
        b9=(Button) findViewById(R.id.Button9);
        b10=(Button) findViewById(R.id.Button10);
        
        
        SharedPreferences pref= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean check = pref.getBoolean("firstime", true);
		if(check==true){
			Intent i = new Intent(MainActivity.this, TutorialScreen.class);//starting activity for the First time
			startActivity(i);
		}
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),AlarmMe.class);
				startActivity(i);
				
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Weather.class);
				startActivity(i);
				
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Places.class);
				startActivity(i);
			}
				
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Route.class);
				startActivity(i);
				
			}
		});
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Compass.class);
				startActivity(i);
				
			}
		});
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),BmiCalculator.class);
				startActivity(i);
				
			}
		});
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),FirstAidList.class);
				startActivity(i);
				
			}
		});
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),HelplineList.class);
				startActivity(i);
				
			}
		});
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),MyActivity.class);
				startActivity(i);
				
			}
		});
		b10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),NutrientList.class);
				startActivity(i);
				
			}
		});
					
    }
    @Override
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

        //no inspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            finish();
            return true;
        }
        if (id == R.id.action_feedback) {
            startActivity(new Intent(MainActivity.this, Feedback.class));
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    

    }

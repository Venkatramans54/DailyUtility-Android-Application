package com.example.dailyutility;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Weather extends ActionBarActivity {
	
	EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
	   
	   private String url1 = "http://api.wunderground.com/api/51cda8abeca78e10/conditions/q/";
	   private String url2 = ".xml";
	   private Handlexml obj;
	   Button b1;
	   
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_weather);
	      b1=(Button)findViewById(R.id.button);
	      
	      ed1=(EditText)findViewById(R.id.editText);
	      ed2=(EditText)findViewById(R.id.editText2);
	      ed3=(EditText)findViewById(R.id.editText3);
	      ed4=(EditText)findViewById(R.id.editText4);
	      ed5=(EditText)findViewById(R.id.EditText01);
	      ed6=(EditText)findViewById(R.id.EditText02);
	      ed7=(EditText)findViewById(R.id.EditText03);
	      
	      b1.setOnClickListener(new View.OnClickListener() {
	         @Override
	         public void onClick(View v) {
	            String url = ed1.getText().toString();
	            String finalUrl = url1 + url + url2;
	            ed2.setText(finalUrl);
	            
	            obj = new Handlexml(finalUrl);
	            obj.fetchXML();
	            
	            while(obj.parsingComplete);
	            ed2.setText("Country: "+obj.getCountry());
	            ed3.setText("Temperature: "+obj.getTemperature());
	            ed4.setText("Relative Humidity: "+obj.getHumidity());
	            ed5.setText("Climate: "+obj.getClimate());
	            ed6.setText("Wind: "+obj.getWind());
	            ed7.setText("Atmospheric Pressure(mb): "+obj.getPressure());
	         }
	      });
	   }
	   
	  
	   
	   @Override
	   public boolean onOptionsItemSelected(MenuItem item) {
	      // Handle action bar item clicks here. The action bar will
	      // automatically handle clicks on the Home/Up button, so long
	      // as you specify a parent activity in AndroidManifest.xml.
	      
	      int id = item.getItemId();
	      
	      //no inspection SimplifiableIfStatement
	     
	      return super.onOptionsItemSelected(item);
	   }

}

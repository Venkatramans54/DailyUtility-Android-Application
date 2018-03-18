package com.example.dailyutility;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiCalculator extends MainActivity {
	
	EditText e1,e2;
	Button b;
	TextView t2,t1;
	
	 protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_bmi);
	      e1=(EditText) findViewById(R.id.editText001);
	      e2=(EditText) findViewById(R.id.editText002);
	      b=(Button) findViewById(R.id.button001);
	      t2=(TextView) findViewById(R.id.textView002);
	      t1=(TextView) findViewById(R.id.textView001);
	      b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String height=e2.getText().toString();
				String weight=e1.getText().toString();
				if (height != null && !"".equals(height)
		                && weight != null  &&  !"".equals(weight)) {
		            float heightValue = Float.parseFloat(height) / 100;
		            float weightValue = Float.parseFloat(weight);
		 
		            float bmi = weightValue / (heightValue * heightValue);
		 
		            displayBMI(bmi);
				}
				
			}
		});
	   }
	 
	 private void displayBMI(float bmi) {
	        String bmiLabel = "";
	        String bmilabel = "";
	 
	        if (Float.compare(bmi, 15f) <= 0) {
	            bmiLabel = "Very Severely Underweight";
	        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
	            bmiLabel = "Severely Underweight";
	        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
	            bmiLabel = "Underweight";
	        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
	            bmiLabel = "Normal";
	        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
	            bmiLabel = "Overweight";
	        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
	            bmiLabel = "Modertely Obese";
	            bmilabel="Obese class 1";
	        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
	            bmiLabel = "Severely Obese";
	            bmilabel="Obese class 2";
	        } else {
	            bmiLabel = "Very Severely Obese";
	            bmilabel="Obese class 3";
	        }
	        Toast.makeText(getApplicationContext(), "Your Bmi is:"+bmi, Toast.LENGTH_LONG).show();
	        t2.setText(bmiLabel);
	        t1.setText(bmilabel);
	    }
}
	      

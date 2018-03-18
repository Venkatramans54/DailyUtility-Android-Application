package com.example.dailyutility;

import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class Alert extends MainActivity {
	TextView tv;
	EditText e;
	Button b;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        tv=(TextView) findViewById(R.id.txtv);
        e=(EditText) findViewById(R.id.ettv);
        b=(Button) findViewById(R.id.bttv);
        Bundle extras = getIntent().getExtras();
        final String value1 = extras.getString("Value1");
        tv.setText("The Location is:\n "+value1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String phno=e.getText().toString();
									
				try{
					SmsManager sms=SmsManager.getDefault();
					sms.sendTextMessage(phno, null, "My Location is:\n"+value1+"\nNeed Help!", null, null);
					Toast.makeText(getApplicationContext(), "Alert Sent Successfully...", Toast.LENGTH_LONG).show();
					
				}
				catch(Exception e){
					Toast.makeText(getApplicationContext(), "Sorry Try Again...", Toast.LENGTH_LONG).show();
					
				}
				}
				
		});
        
	}
	
}

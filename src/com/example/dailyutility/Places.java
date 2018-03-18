package com.example.dailyutility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Places extends Activity {
	
	WebView webview;
	 @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_places);
	      webview=(WebView) findViewById(R.id.webView1);
	      webview.getSettings().setJavaScriptEnabled(true);
	      webview.setWebViewClient(new WebViewClient() {

		        @Override
		        public boolean shouldOverrideUrlLoading(WebView view, String url) {
		                view.loadUrl(url);
		                return true;
		                }
		        });
	      
	      webview.setWebViewClient(new WebViewClient() {
	    	    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
	    	    	Intent i=new Intent(getApplicationContext(),Caution.class);
					startActivity(i);

	    	    }
	    	});
			
			webview.loadUrl("https://www.google.co.in/maps/@11.0242567,76.9955108,12z");
	 }

	 @Override
		public boolean onKeyDown(int keyCode, KeyEvent event) 
		{
			if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
				webview.goBack();
				return true;
			}
			return super.onKeyDown(keyCode, event);		
}

}

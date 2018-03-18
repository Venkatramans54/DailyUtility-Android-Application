package com.example.dailyutility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Route extends Activity {

	WebView webview;
	 @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_route);
	      webview=(WebView) findViewById(R.id.webView1);
	      webview.getSettings().setJavaScriptEnabled(true);
	      webview.getSettings().setBuiltInZoomControls(true);
	      webview.getSettings().setDisplayZoomControls(true);
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
			
			webview.loadUrl("https://www.google.co.in/maps/dir///@10.9871858,77.0010039,11z");
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

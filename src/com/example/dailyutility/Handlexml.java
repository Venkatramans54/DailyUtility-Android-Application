package com.example.dailyutility;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class Handlexml {
	
	private String country = "county";
	   private String temperature = "temperature";
	   private String humidity = "humidity";
	   private String climate = "climate";
	   private String wind = "wind";
	   private String pressure = "pressure";
	   private String urlString = null;
	   private XmlPullParserFactory xmlFactoryObject;
	   public volatile boolean parsingComplete = true;
	   
	   public Handlexml(String url){
	      this.urlString = url;
	   }
	   
	   public String getCountry(){
	      return country;
	   }
	   
	   public String getTemperature(){
	      return temperature;
	   }
	   
	   public String getHumidity(){
	      return humidity;
	   }
	   
	   public String getClimate(){
		      return climate;
		   }
	   
	   public String getWind(){
		      return wind;
		   }
	   
	   public String getPressure(){
		      return pressure;
		   }
	   
	   
	   public void parseXMLAndStoreIt(XmlPullParser myParser) {
	      int event;
	      String text=null;
	      
	      try {
	         event = myParser.getEventType();
	         
	         while (event != XmlPullParser.END_DOCUMENT) {
	            String name=myParser.getName();
	         
	            switch (event){
	               case XmlPullParser.START_TAG:
	               break;
	            
	               case XmlPullParser.TEXT:
	               text = myParser.getText();
	               break;
	            
	               case XmlPullParser.END_TAG:
	               if(name.equals("country")){
	                  country = text;
	               }
	            
	               else if(name.equals("relative_humidity")){
	                  humidity = text;
	               }
	            
	            
	               else if(name.equals("temperature_string")){
	                  temperature = text;
	               }
	               
	               else if(name.equals("weather")){
	                   climate = text;
	                }
	               
	               else if(name.equals("wind_string")){
	                   wind = text;
	                }

	               else if(name.equals("pressure_mb")){
	                   pressure = text;
	                }
	               
	               else{
	               }
	               break;
	            }
	            event = myParser.next();
	         }
	         parsingComplete = false;
	      }
	      
	      catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	   
	   public void fetchXML(){
	      Thread thread = new Thread(new Runnable(){
	         @Override
	         public void run() {
	            try {
	               URL url = new URL(urlString);
	               HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	            
	               conn.setReadTimeout(10000 /* milliseconds */);
	               conn.setConnectTimeout(15000 /* milliseconds */);
	               conn.setRequestMethod("GET");
	               conn.setDoInput(true);
	               conn.connect();
	            
	               InputStream stream = conn.getInputStream();
	               xmlFactoryObject = XmlPullParserFactory.newInstance();
	               XmlPullParser myparser = xmlFactoryObject.newPullParser();
	               
	               myparser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
	               myparser.setInput(stream, null);
	               
	               parseXMLAndStoreIt(myparser);
	               stream.close();
	            }
	            catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
	      });
	      thread.start();
	   }

}

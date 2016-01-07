package com.john.testlog;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity111 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		showLog();
		System.out.println("--------------------");
//		try {
//			throw new Exception("我的异常。。。");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	private void showLog(){
		MyLogger.showLogWithLineNum(3,"onCreate...");
	}
	
	private String readFromProperties() throws IOException{
		Properties prop = new Properties();
		/*InputStream in = (InputStream)getAssets().open("/assets/myProperties.properties");
		prop.load(in);*/
		
		prop.load(MainActivity111.class.getResourceAsStream("/assets/myProperties.properties"));
		
		return null;
	}
}

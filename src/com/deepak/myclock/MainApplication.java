package com.deepak.myclock;


import java.util.HashMap;

import android.app.Application;
import android.content.Context;


public class MainApplication extends Application {
	public static volatile Context applicationContext = null;
  @Override
  public void onCreate() {
    super.onCreate();
 
    
  }
}

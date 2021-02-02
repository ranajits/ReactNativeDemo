package com.demoproject;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "MainScreen";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AppCenter.start(getApplication(), "9deda03a-3754-4cff-9c95-fa28e1076eaf",
            Analytics.class, Crashes.class);
  }
}

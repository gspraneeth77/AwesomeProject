package com.awesomeproject;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.walmart.sdk.MySDK;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.startSdk).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        MySDK.getInstance().startReactApp(MainActivity.this);
      }
    });
  }
}

package com.chengwc.howto;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

  TextView my_hello_text_view;
  Button mClickMeBtn;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(com.chengwc.howto.R.layout.activity_my);
    my_hello_text_view = (TextView) findViewById(com.chengwc.howto.R.id.my_hello_text_view);
    mClickMeBtn = (Button) findViewById(com.chengwc.howto.R.id.clickMeBtn);
  }

  public void clickMeBtnPressed(View view) {
    my_hello_text_view.setText(getString(com.chengwc.howto.R.string.ok_thanks));
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(com.chengwc.howto.R.menu.my, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == com.chengwc.howto.R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}

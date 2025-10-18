package com.example.giuaki;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.appbar.MaterialToolbar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;

public class HomeActivity extends AppCompatActivity {
  private TextView txtHello;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    MaterialToolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    txtHello = findViewById(R.id.txtHello);
    String name = getIntent().getStringExtra("userName");
    if(name.isEmpty()){
      startActivity(new Intent(this, MainActivity.class));
      return;
    }
    txtHello.setText("Hello, " + name);
  }
  @Override public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }
  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item){
int id = item.getItemId();
if(id == R.id.ic_home)
  }
}

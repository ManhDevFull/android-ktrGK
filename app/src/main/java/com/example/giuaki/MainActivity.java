package com.example.giuaki;

import android.content.Intent;
import com.google.android.material.textfield.TextInputEditText;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private TextInputEditText ipPass, ipName;
  private Button btnLogin;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ipName = findViewById(R.id.ipName);
    ipPass = findViewById(R.id.ipPass);
    btnLogin = findViewById(R.id.btnLogin);
    btnLogin.setOnClickListener(v->{
      String name = ipName.getText() == null ? "" : ipName.getText().toString().trim();
      String pass = ipPass.getText() == null ? "" : ipPass.getText().toString().trim();
      if(name.isEmpty() && pass.isEmpty()){
        ipName.setError("Login faild !!!");
        return;
      }
      startActivity(new Intent(this, HomeActivity.class));
    });
  }
}

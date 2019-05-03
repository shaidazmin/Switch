package com.example.nz.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = (Switch) findViewById(R.id.switchOne);
       aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(aSwitch.isChecked()){
                   Toast.makeText(MainActivity.this,"Switch is :  "+isChecked,Toast.LENGTH_SHORT).show();
               }else {
                   Toast.makeText(MainActivity.this,"Switch is :  "+isChecked,Toast.LENGTH_SHORT).show();
               }
           }
       });


    }
}

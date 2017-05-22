package com.example.adanur.nms;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread mt=new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                    Intent intent=new Intent(getApplicationContext(),HelloWorld.class);
                startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                

            }
        };
        mt.start();

    }
}

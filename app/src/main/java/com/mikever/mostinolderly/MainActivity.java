package com.mikever.mostinolderly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







//        123456



        setBasicButtonIntent();

    }






    private void setBasicButtonIntent () {
        Button button_news = (Button) findViewById(R.id.button_news);
        button_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, News.class);
                startActivity(i);
            }
        });


        Button button_InTest = (Button) findViewById(R.id.button_InTest);
        button_InTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, InTest.class);
                startActivity(i);
            }
        });


        Button button_health = (Button) findViewById(R.id.button_health);
        button_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Health.class);
                startActivity(i);
            }
        });



    }



}

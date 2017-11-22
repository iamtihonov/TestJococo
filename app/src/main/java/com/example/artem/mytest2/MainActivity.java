package com.example.artem.mytest2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private TextView text;
    private PreferencesHelper preferencesHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("testLog", "MainActivity onCreate");

        preferencesHelper = new PreferencesHelper(this);
        text = findViewById(R.id.text);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("testLog", "MainActivity onClick 2");
                int value1 = Util.plus(2,3);
                preferencesHelper.saveData1("test");
                String value2 = preferencesHelper.getData1();
                String resultString = "values = " + String.valueOf(value1) + ":" +  value2;
                text.setText(resultString);
            }
        });

    }
}

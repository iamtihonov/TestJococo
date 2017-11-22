package com.example.artem.mytest2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private PreferencesHelper preferencesHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferencesHelper = new PreferencesHelper(this);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.hide).setOnClickListener(this);
        text = findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            int value1 = Util.plus(2,3);
            preferencesHelper.saveData1("test");
            String value2 = preferencesHelper.getData1();
            String resultString = "values = " + String.valueOf(value1) + ":" +  value2;
            text.setText(resultString);
        } else {
            v.setVisibility(View.GONE);
        }
    }
}

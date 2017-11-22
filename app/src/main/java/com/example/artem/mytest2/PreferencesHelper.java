package com.example.artem.mytest2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

class PreferencesHelper  {
    private static final String PREF_USER_DATA_1 = "PREF_USER_DATA_1";

    private SharedPreferences sharedPreferences;

    PreferencesHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(context.
                getPackageName(), Context.MODE_PRIVATE);
    }

    void saveData1(@NonNull String data1) {
        sharedPreferences.edit().putString(PREF_USER_DATA_1, data1).apply();
    }

    String getData1() {
        return sharedPreferences.getString(PREF_USER_DATA_1, "");
    }
}

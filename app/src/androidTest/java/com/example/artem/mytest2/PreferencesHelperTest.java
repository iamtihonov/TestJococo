package com.example.artem.mytest2;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreferencesHelperTest {
    @Test
    public void saveData1() throws Exception {
        PreferencesHelper preferencesHelper = new PreferencesHelper(InstrumentationRegistry.getTargetContext());
        preferencesHelper.saveData1("123");
        assertEquals("123", preferencesHelper.getData1());
    }
}
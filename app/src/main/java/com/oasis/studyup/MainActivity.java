package com.oasis.studyup;

import android.os.Bundle;

import com.oasis.studyup.base.BaseActivity;

import hugo.weaving.DebugLog;

/**
 * Launch Activity
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @DebugLog
    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }
}

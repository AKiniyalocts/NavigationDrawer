package com.rightmeowapps.navigationdrawer.drawer.base;

import android.os.Bundle;

import butterknife.ButterKnife;


/**
 * Created by anthony on 7/17/15.
 */
public abstract class ButterKnifeActivity extends BaseActivity {

    public abstract int getContentView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
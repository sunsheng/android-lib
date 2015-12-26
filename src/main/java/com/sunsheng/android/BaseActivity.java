package com.sunsheng.android;

import android.app.Activity;
import android.os.Bundle;

import com.sunsheng.android.library.R;

/**
 * Created by sunsheng1 on 15/12/26.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
    }
}

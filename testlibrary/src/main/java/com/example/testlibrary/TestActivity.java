package com.example.testlibrary;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Android Studio.
 * User: LENOVO
 * Date: 2021/4/18 11:16
 * Describe:
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToastUtils.showToast(this, "TestActivity");
    }

}

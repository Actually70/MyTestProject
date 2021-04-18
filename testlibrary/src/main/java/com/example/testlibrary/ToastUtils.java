package com.example.testlibrary;

import android.content.Context;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by Android Studio.
 * User: LENOVO
 * Date: 2021/4/18 11:13
 * Describe:
 */
public class ToastUtils {

    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, LENGTH_SHORT);
    }

}

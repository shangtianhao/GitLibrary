package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ShangToast {

    public static void showToast(String meaasge, Context context) {

        Toast.makeText(context, "Shang:" + meaasge, Toast.LENGTH_SHORT).show();
    }
}

package com.example.steve.swap_it;

/**
 * Created by Steve on 6/11/2016.
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

    public static boolean openMarketList(Context c) {

        Intent intent = new Intent(c.getApplicationContext(), MarketActivity.class);
        // if intent is available
        if (intent != null) {
            try {
                // launch application
                c.startActivity(intent);
                return true;

            } catch (ActivityNotFoundException ex) {

                Toast toast = Toast.makeText(c, "Application Not Found", Toast.LENGTH_LONG);
                // display message
                toast.show();
            }
        }
        // by default, fail to launch
        return false;
    }

}
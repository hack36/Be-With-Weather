package com.example.sunny.knowweather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by sunny on 1/13/2018.
 */

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Allahabad, IN");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}

package pw.productors.dagger.model;


import android.util.Log;

public class Water {

    String TAG = "SPACETAG";

    public Water() {
        Log.d(TAG, "water constructor");
    }

    void log(){
        Log.d(TAG, "water logging by activity");
    }
}

package pw.productors.dagger.model;


import android.util.Log;

public class Food {

    private String TAG = "SPACETAG";

    private Water water;

    public Food() {
        Log.d(TAG, "food constructor");
    }

    public Food(Water water) {
        Log.d(TAG, "food constructor");
        this.water = water;
    }

    public void logWater() {
        water.log();
    }
}

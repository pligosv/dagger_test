package pw.productors.secondlesson.model;

import android.util.Log;

import javax.inject.Inject;

public class Pig {

    String TAG = "SPACETAG";

    @Inject
    public Pig() {
        Log.d(TAG, "Pig: constructor");
    }

    public void log() {
        Log.d(TAG, "log: pig says LOGGGG!");
    }
}
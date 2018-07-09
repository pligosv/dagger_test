package pw.productors.secondlesson.model;

import android.util.Log;

public class Logger implements EventHandler {

    String TAG = "SPACETAG";

    public Logger() {
        Log.d(TAG, "Logger: constructor");
    }
}

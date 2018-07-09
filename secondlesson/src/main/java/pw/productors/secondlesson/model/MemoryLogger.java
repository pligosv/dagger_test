package pw.productors.secondlesson.model;

import android.util.Log;

public class MemoryLogger implements MemoryHandler {

    String TAG = "SPACETAG";

    public MemoryLogger() {
        Log.d(TAG, "MemoryLogger: constructor");
    }
}

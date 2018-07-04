package pw.productors.dagger.model;


import android.util.Log;

public class HttpClient {

    private String TAG = "SPACETAG";

    public HttpClient() {
        Log.d(TAG, "HttpClient constructor");
    }

    void log() {
        Log.d(TAG, "http client logged by activity");
    }
}

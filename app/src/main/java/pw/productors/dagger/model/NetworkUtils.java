package pw.productors.dagger.model;


import android.util.Log;

public class NetworkUtils {

    private String TAG = "SPACETAG";

    private HttpClient client;

    public NetworkUtils(HttpClient client) {
        Log.d(TAG, "network utils constructor");
        this.client = client;
    }

    public void logClient() {
        client.log();
    }
}

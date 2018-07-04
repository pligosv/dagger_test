package pw.productors.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pw.productors.dagger.model.DatabaseHelper;
import pw.productors.dagger.model.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = App.getComponent().getDatabaseHelper();
        networkUtils = App.getComponent().getNetworkUtils();
    }
}

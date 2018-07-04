package pw.productors.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import pw.productors.dagger.model.DatabaseHelper;
import pw.productors.dagger.model.Food;
import pw.productors.dagger.model.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    NetworkUtils networkUtils;

    @Inject
    Food food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = App.getComponent().getDatabaseHelper();
        networkUtils = App.getComponent().getNetworkUtils();

        App.getComponent().injectsMainActivity(this);
        networkUtils.logClient();
        food.logWater();
    }
}

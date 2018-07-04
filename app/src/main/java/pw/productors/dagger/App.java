package pw.productors.dagger;


import android.app.Application;

import pw.productors.dagger.component.AppComponent;
import pw.productors.dagger.component.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}

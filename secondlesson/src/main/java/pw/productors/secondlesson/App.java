package pw.productors.secondlesson;


import android.app.Application;

import pw.productors.secondlesson.component.AppComponent;
import pw.productors.secondlesson.component.DaggerAppComponent;

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

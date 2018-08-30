package com.example.fifthlesson;

import android.app.Application;
import com.example.fifthlesson.component.*;
import com.example.fifthlesson.model.SomeObject;
import com.example.fifthlesson.module.AppModule;
import com.example.fifthlesson.module.SuperModule;

public class App extends Application {

    private static AppComponent component;
    private static BuilderComponent builderComponent;
    private static SuperComponent superComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // We have to create SomeObject to pass it to AppModule and pass it to builder
        SomeObject someObject = new SomeObject();
        AppModule appModule = new AppModule(someObject);
        component = DaggerAppComponent.builder().appModule(appModule).build();

        // We can create our own Builder
        SomeObject someObject1 = new SomeObject();
        AppModule appModule1 = new AppModule(someObject1);
        builderComponent = DaggerBuilderComponent.builder().methodForSettingAppModule(appModule1).letsBuildThisComponent();

        // Create component without module initialization (module is empty)
        SomeObject someObject2 = new SomeObject();
        superComponent = DaggerSuperComponent.builder().setMyInstanceOfSomeObject(someObject).buildSuperComponent();

    }

    public static AppComponent getComponent() {
        return component;
    }

    public static BuilderComponent getBuilderComponent() {
        return builderComponent;
    }

    public static SuperComponent getSuperComponent() {
        return superComponent;
    }
}

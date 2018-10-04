package com.example.fifthlesson_old_example.app;

import android.content.Context;
import android.os.Bundle;
import com.example.fifthlesson_old_example.app.dagger.AppComponent;
import com.example.fifthlesson_old_example.app.dagger.AppModule;
import com.example.fifthlesson_old_example.app.dagger.DaggerAppComponent;
import com.example.fifthlesson_old_example.first.dagger.FirstActivityComponent;
import com.example.fifthlesson_old_example.second.dagger.SecondActivityComponent;
import com.example.fifthlesson_old_example.second.dagger.SecondActivityModule;

public class ComponentsHolder {

    private final Context context;

    private AppComponent appComponent;
    private FirstActivityComponent firstActivityComponent;
    private SecondActivityComponent secondActivityComponent;

    public ComponentsHolder(Context context) {
        this.context = context;
    }

    void init() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(context)).build();
    }

    // App component
    public AppComponent getAppComponent() {
        return appComponent;
    }

    // FirstActivityComponent

    public FirstActivityComponent getFirstActivityComponent() {
        if (firstActivityComponent == null) {
            firstActivityComponent = getAppComponent().createFirstActivityComponent();
        }
        return firstActivityComponent;
    }

    public void releaseFirstActivityComponent() {
        firstActivityComponent = null;
    }

    // SecondActivityComponent


    public SecondActivityComponent getSecondActivityComponent(Bundle args) {
        if (secondActivityComponent == null) {
            secondActivityComponent = getAppComponent().createSecondActivityComponent(new SecondActivityModule(args));
        }
        return secondActivityComponent;
    }

    public void releaseSecondActivityComponent() {
        secondActivityComponent = null;
    }
}

package com.example.fifthlesson_old_example.second.dagger;

import android.os.Bundle;
import com.example.fifthlesson_old_example.second.SecondActivityPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {

    private final Bundle args;

    public SecondActivityModule(Bundle args) {
        this.args = args;
    }

    @SecondActivityScope
    @Provides
    SecondActivityPresenter provideSecondActivityPresenter() {
        return new SecondActivityPresenter(args);
    }
}

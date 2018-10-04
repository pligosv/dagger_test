package com.example.fifthlesson_old_example.first.dagger;

import com.example.fifthlesson_old_example.first.FirstActivityPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class FirstActivityModule {

    @FirstActivityScope
    @Provides
    FirstActivityPresenter provideFirstActivityPresenter() {return new FirstActivityPresenter();}
}

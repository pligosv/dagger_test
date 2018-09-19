package com.example.fifthlesson.module;

import com.example.fifthlesson.model.SampleObject;
import dagger.Module;
import dagger.Provides;

@Module
public class FirstAppModule {

    @Provides
    SampleObject provideSampleObject() {
        return new SampleObject();
    }
}

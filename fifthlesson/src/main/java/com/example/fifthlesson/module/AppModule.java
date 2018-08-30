package com.example.fifthlesson.module;

import com.example.fifthlesson.model.SomeObject;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final SomeObject someObject;

    public AppModule(SomeObject someObject) {
        this.someObject = someObject;
    }

    @Provides
    SomeObject provideSomeObject() {
        return someObject;
    }
}

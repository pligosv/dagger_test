package com.example.fourthlesson.module;

import dagger.Module;
import dagger.Provides;
import dagger.producers.Production;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Module
public class ExecutorModule {

    @Provides
    @Production
    static Executor executor() {
        return Executors.newSingleThreadExecutor();
    }
}

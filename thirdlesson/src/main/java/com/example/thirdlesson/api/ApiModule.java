package com.example.thirdlesson.api;

import android.util.Log;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ApiModule {

    @Provides
    @Singleton
    public ApiService provideApiService() {
        Log.d("SPACETAG", "new apiservice");
        return new ApiService();
    }
}

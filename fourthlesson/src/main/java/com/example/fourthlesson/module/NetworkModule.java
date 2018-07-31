package com.example.fourthlesson.module;

import com.example.fourthlesson.model.NetworkUtils;
import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils(){
        return new NetworkUtils();
    }
}

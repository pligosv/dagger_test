package com.example.fourthlesson.module;

import com.example.fourthlesson.model.NetworkUtils;
import com.example.fourthlesson.model.User;
import com.example.fourthlesson.model.UserData;
import dagger.producers.Produced;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;

import java.util.concurrent.ExecutionException;

@ProducerModule(includes = NetworkModule.class)
public class UserDataModule {

    User mUser;

    public UserDataModule(User user) {
        mUser = user;
    }

    @Produces
    String getUserDataJson(NetworkUtils networkUtils) {
        return networkUtils.getUserData(mUser);
    }

    @Produces
    UserData getUserData(Produced<String> userDataJson) {
        try{
            return UserData.parsefromJson(userDataJson.get());
        } catch (ExecutionException e) {
            return UserData.WRONG_USER;
        }
    }
}

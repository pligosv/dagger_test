package com.example.fourthlesson.component;

import com.example.fourthlesson.model.UserData;
import com.example.fourthlesson.module.ExecutorModule;
import com.example.fourthlesson.module.UserDataModule;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProductionComponent;

@ProductionComponent(modules = {UserDataModule.class, ExecutorModule.class})
public interface UserComponent {

    ListenableFuture<UserData> getUserData();
}

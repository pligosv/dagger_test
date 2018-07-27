package com.example.thirdlesson;

import com.example.thirdlesson.api.ApiModule;
import com.example.thirdlesson.login.LoginActivityComponent;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

    LoginActivityComponent createLoginComponent();
}

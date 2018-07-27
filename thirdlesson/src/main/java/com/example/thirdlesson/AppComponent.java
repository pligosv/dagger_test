package com.example.thirdlesson;

import com.example.thirdlesson.api.ApiModule;
import com.example.thirdlesson.login.LoginActivityComponent;
import com.example.thirdlesson.mail.MailComponent;
import com.example.thirdlesson.mail.MailModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

    LoginActivityComponent createLoginComponent();

    MailComponent createMailComponent(MailModule mailModule);
}

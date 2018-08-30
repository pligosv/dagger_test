package com.example.fifthlesson.component;

import com.example.fifthlesson.model.SomeObject;
import com.example.fifthlesson.module.AppModule;
import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    SomeObject getSomeObject();
}

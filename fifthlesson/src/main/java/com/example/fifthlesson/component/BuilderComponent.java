package com.example.fifthlesson.component;

import com.example.fifthlesson.model.SomeObject;
import com.example.fifthlesson.module.AppModule;
import dagger.Component;

@Component(modules = {AppModule.class})
public interface BuilderComponent {

    SomeObject getSomeObject();

    @Component.Builder
    interface MyBuilder {
        BuilderComponent letsBuildThisComponent();
        BuilderComponent.MyBuilder methodForSettingAppModule(AppModule appModule);
    }
}

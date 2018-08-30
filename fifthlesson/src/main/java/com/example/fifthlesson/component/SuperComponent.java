package com.example.fifthlesson.component;

import com.example.fifthlesson.model.SomeObject;
import com.example.fifthlesson.module.SuperModule;
import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {SuperModule.class})
public interface SuperComponent {

    SomeObject getSomeObject();

    @Component.Builder
    interface MyBuilder {
        SuperComponent buildSuperComponent();

        @BindsInstance
        MyBuilder setMyInstanceOfSomeObject(SomeObject someObject);
    }
}

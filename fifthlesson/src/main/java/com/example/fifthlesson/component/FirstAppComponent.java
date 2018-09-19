package com.example.fifthlesson.component;

import com.example.fifthlesson.model.SampleObject;
import com.example.fifthlesson.module.FirstAppModule;
import dagger.Component;

@Component(modules = {FirstAppModule.class})
public interface FirstAppComponent {
    SampleObject getSampleObject();
}

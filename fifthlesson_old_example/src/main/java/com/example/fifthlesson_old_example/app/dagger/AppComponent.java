package com.example.fifthlesson_old_example.app.dagger;


import com.example.fifthlesson_old_example.first.dagger.FirstActivityComponent;
import com.example.fifthlesson_old_example.second.dagger.SecondActivityComponent;
import com.example.fifthlesson_old_example.second.dagger.SecondActivityModule;
import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    FirstActivityComponent createFirstActivityComponent();
    SecondActivityComponent createSecondActivityComponent(SecondActivityModule secondActivityModule);
}

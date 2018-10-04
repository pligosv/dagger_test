package com.example.fifthlesson_old_example.second.dagger;

import com.example.fifthlesson_old_example.second.SecondActivity;
import dagger.Component;
import dagger.Subcomponent;

@SecondActivityScope
@Subcomponent(modules = {SecondActivityModule.class})
public interface SecondActivityComponent {
    void inject(SecondActivity secondActivity);
}

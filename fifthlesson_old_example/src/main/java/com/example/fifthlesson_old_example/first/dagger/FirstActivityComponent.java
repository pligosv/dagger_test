package com.example.fifthlesson_old_example.first.dagger;

import com.example.fifthlesson_old_example.first.FirstActivity;
import dagger.Component;
import dagger.Subcomponent;

@FirstActivityScope
@Subcomponent(modules = {FirstActivityModule.class})
public interface FirstActivityComponent {
    void inject(FirstActivity firstActivity);
}

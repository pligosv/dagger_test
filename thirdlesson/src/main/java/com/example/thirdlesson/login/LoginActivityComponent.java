package com.example.thirdlesson.login;

import com.example.thirdlesson.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {

    void injectLoginActivity(LoginActivity activity);
}

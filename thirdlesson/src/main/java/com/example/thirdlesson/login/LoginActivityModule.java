package com.example.thirdlesson.login;

import com.example.thirdlesson.ActivityScope;
import com.example.thirdlesson.account.AccountManager;
import com.example.thirdlesson.api.ApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @ActivityScope
    @Provides
    AccountManager provideAccountManager(ApiService apiService) {
        return new AccountManager(apiService);
    }

    @ActivityScope
    @Provides
    LoginActivityPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }
}

package com.example.thirdlesson.mail;

import com.example.thirdlesson.api.ApiService;
import com.example.thirdlesson.datatype.Account;
import dagger.Module;
import dagger.Provides;

@Module
public class MailModule {

    private Account account;

    public MailModule(Account account) {
        this.account = account;
    }

    @Provides
    public Account provideAccount() {return account;}

    @Provides
    @MailScope
    MailManager provideMailmanager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }

}

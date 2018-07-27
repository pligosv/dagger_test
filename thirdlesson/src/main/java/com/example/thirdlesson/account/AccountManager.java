package com.example.thirdlesson.account;

import com.example.thirdlesson.api.ApiService;
import com.example.thirdlesson.datatype.Account;

public class AccountManager {

    private ApiService apiService;

    public AccountManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public Account login(String user, String password) {return apiService.login(user,password);}
}

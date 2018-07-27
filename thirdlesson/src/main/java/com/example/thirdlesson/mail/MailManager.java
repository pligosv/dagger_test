package com.example.thirdlesson.mail;

import com.example.thirdlesson.api.ApiService;
import com.example.thirdlesson.datatype.Account;
import com.example.thirdlesson.datatype.Folder;
import com.example.thirdlesson.datatype.Letter;

import java.util.List;

public class MailManager {

    private Account account;
    private ApiService apiService;

    public MailManager(Account account, ApiService apiService) {
        this.account = account;
        this.apiService = apiService;
    }

    public List<Folder> getFolders() {
        return apiService.getFolders(account);
    }

    public List<Letter> getLetters(Folder folder) {
        return apiService.getLetters(folder);
    }
}

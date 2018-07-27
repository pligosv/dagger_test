package com.example.thirdlesson.folders;

import com.example.thirdlesson.mail.MailManager;

public class FolderListActivityPresenter {

    private FolderListActivity activity;
    private MailManager mailManager;

    public FolderListActivityPresenter(MailManager mailManager) {
        this.mailManager = mailManager;
    }

    public void setActivity(FolderListActivity activity) {
        this.activity = activity;
    }

    public void loadFolders() {
        activity.showFolders(mailManager.getFolders());
    }
}

package com.example.thirdlesson.letters;

import com.example.thirdlesson.datatype.Folder;
import com.example.thirdlesson.mail.MailManager;

public class LetterListActivityPresenter {

    private LetterListActivity activity;
    private Folder folder;
    private MailManager mailManager;

    public LetterListActivityPresenter(Folder folder, MailManager mailManager) {
        this.folder = folder;
        this.mailManager = mailManager;
    }

    public void setActivity(LetterListActivity activity) {
        this.activity = activity;
    }

    public void loadLetters() {
        activity.showLetters(mailManager.getLetters(folder));
    }
}

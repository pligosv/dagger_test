package com.example.thirdlesson.mail;

import com.example.thirdlesson.folders.FolderListActivityComponent;
import com.example.thirdlesson.letters.LetterListActivityComponent;
import com.example.thirdlesson.letters.LetterListActivityModule;
import dagger.Component;
import dagger.Subcomponent;

@MailScope
@Subcomponent(modules = MailModule.class)
public interface MailComponent {
    FolderListActivityComponent createFoldersListActivityComponent();
    LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModule letterListActivityModule);
}

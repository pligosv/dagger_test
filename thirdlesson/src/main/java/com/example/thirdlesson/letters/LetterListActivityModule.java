package com.example.thirdlesson.letters;

import com.example.thirdlesson.ActivityScope;
import com.example.thirdlesson.datatype.Folder;
import com.example.thirdlesson.mail.MailManager;
import dagger.Module;
import dagger.Provides;

@Module
public class LetterListActivityModule {
    private Folder folder;

    public LetterListActivityModule(Folder folder) {this.folder = folder;}

    @ActivityScope
    @Provides
    public Folder provideFolder() {return  folder;}

    @ActivityScope
    @Provides
    public LetterListActivityPresenter provideLetterListActivityPresenter(Folder folder, MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}

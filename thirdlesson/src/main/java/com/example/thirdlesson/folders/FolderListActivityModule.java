package com.example.thirdlesson.folders;

import com.example.thirdlesson.ActivityScope;
import com.example.thirdlesson.mail.MailManager;
import dagger.Module;
import dagger.Provides;

@Module
public class FolderListActivityModule {

    @ActivityScope
    @Provides
    public FolderListActivityPresenter provideFolderListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}

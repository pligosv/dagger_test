package com.example.thirdlesson.folders;

import com.example.thirdlesson.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = FolderListActivityModule.class)
public interface FolderListActivityComponent {

    void injectFoldersListActivity(FolderListActivity activity);
}

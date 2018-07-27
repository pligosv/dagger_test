package com.example.thirdlesson.letters;

import com.example.thirdlesson.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = LetterListActivityModule.class)
public interface LetterListActivityComponent {

    void injectLetterListActivity(LetterListActivity activity);
}

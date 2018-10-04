package com.example.fifthlesson_old_example.second.dagger;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondActivityScope {
}

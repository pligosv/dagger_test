package com.example.fifthlesson_old_example.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.fifthlesson_old_example.R;
import com.example.fifthlesson_old_example.app.App;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_ARGS = "args";

    @Inject
    SecondActivityPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle args = getIntent().getBundleExtra(EXTRA_ARGS);
        App.getApp(this).getComponentsHolder().getSecondActivityComponent(args).inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(isFinishing()) {
            App.getApp(this).getComponentsHolder().releaseSecondActivityComponent();
        }
    }
}

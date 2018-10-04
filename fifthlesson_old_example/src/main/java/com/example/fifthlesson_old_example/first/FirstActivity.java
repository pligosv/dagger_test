package com.example.fifthlesson_old_example.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.fifthlesson_old_example.R;
import com.example.fifthlesson_old_example.app.App;
import com.example.fifthlesson_old_example.second.SecondActivity;

import javax.inject.Inject;

public class FirstActivity extends AppCompatActivity {

    @Inject
    FirstActivityPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        ButterKnife.bind(this);

        App.getApp(this).getComponentsHolder().getFirstActivityComponent().inject(this);
    }

    @OnClick(R.id.goToSecondActivity)
    void onGoToSecondActivity() {
        startActivity(new Intent(this, SecondActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(isFinishing()) {
            App.getApp(this).getComponentsHolder().releaseFirstActivityComponent();
        }
    }
}

package com.example.fourthlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.fourthlesson.component.DaggerUserComponent;
import com.example.fourthlesson.component.UserComponent;
import com.example.fourthlesson.model.User;
import com.example.fourthlesson.model.UserData;
import com.example.fourthlesson.module.UserDataModule;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

import javax.annotation.Nullable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        UserComponent userComponent = DaggerUserComponent.builder().userDataModule(new UserDataModule(user)).build();

        ListenableFuture<UserData> listenableFuture = userComponent.getUserData();
        Futures.addCallback(listenableFuture, new FutureCallback<UserData>() {
            @Override
            public void onSuccess(@Nullable UserData result) {
                Log.d("SPACETAG", "onSuccess: name = " + result.getName());
                Log.d("SPACETAG", "onSuccess: text = " + result.getText());
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });
    }
}

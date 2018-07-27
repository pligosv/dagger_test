package com.example.thirdlesson.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Toast;
import com.example.thirdlesson.App;
import com.example.thirdlesson.R;
import com.example.thirdlesson.datatype.Account;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    @Inject
    LoginActivityPresenter presenter;

    EditText userEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginActivityComponent loginActivityComponent = App.getInstance().getAppComponent().createLoginComponent();
        loginActivityComponent.injectLoginActivity(this);

        userEditText = findViewById(R.id.user);
        passwordEditText = findViewById(R.id.password);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(userEditText.getText().toString(), passwordEditText.getText().toString());
            }
        });
    }

    void showMailForAccount(Account account) {
        Toast.makeText(this, userEditText.getText().toString() + " " + passwordEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Inject
    void setActivity() {presenter.setActivity(this);}

}

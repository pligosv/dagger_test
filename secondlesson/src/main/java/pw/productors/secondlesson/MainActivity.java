package pw.productors.secondlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import pw.productors.secondlesson.model.Animal;

public class MainActivity extends AppCompatActivity {

    // TODO: 04.07.18 Сделать Lazy и далее по уроку все остальные
    @Inject
    Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().injectMainActivity(this);
    }
}

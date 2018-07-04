package pw.productors.secondlesson.component;

import dagger.Component;
import pw.productors.secondlesson.MainActivity;
import pw.productors.secondlesson.module.AnimalModule;

@Component(modules = {AnimalModule.class})
public interface AppComponent {

    void injectMainActivity(MainActivity mainActivity);
}

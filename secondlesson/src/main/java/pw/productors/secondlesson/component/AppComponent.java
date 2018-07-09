package pw.productors.secondlesson.component;

import dagger.Component;
import pw.productors.secondlesson.MainActivity;
import pw.productors.secondlesson.module.AnimalModule;
import pw.productors.secondlesson.module.BirdModule;
import pw.productors.secondlesson.module.EventModule;
import pw.productors.secondlesson.module.MemoryModule;
import pw.productors.secondlesson.module.PandaModule;
import pw.productors.secondlesson.module.RabbitModule;
import pw.productors.secondlesson.module.ServiceModule;
import pw.productors.secondlesson.module.ThreadModule;

@Component(modules = {AnimalModule.class, BirdModule.class, PandaModule.class,
        RabbitModule.class, EventModule.class, MemoryModule.class, ThreadModule.class,
        ServiceModule.class})
public interface AppComponent {

    void injectMainActivity(MainActivity mainActivity);
}

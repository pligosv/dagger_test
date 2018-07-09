package pw.productors.secondlesson.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import pw.productors.secondlesson.model.Panda;

@Module
public class PandaModule {

    @Named("male")
    @Provides
    Panda providePandaMale() {
        return new Panda("Панда мальчик");
    }

    @Named("female")
    @Provides
    Panda providePandeFemale() {
        return new Panda("Панда девочка");
    }
}

package pw.productors.secondlesson.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.secondlesson.model.Animal;

@Module
public class AnimalModule {

    @Provides
    Animal provideAnimal() {
        return new Animal();
    }
}

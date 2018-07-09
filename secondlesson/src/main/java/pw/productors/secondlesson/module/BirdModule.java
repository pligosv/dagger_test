package pw.productors.secondlesson.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.secondlesson.model.Bird;

@Module
public class BirdModule {

    @Provides
    Bird provideBird() {
        return new Bird();
    }
}

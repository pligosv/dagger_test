package pw.productors.secondlesson.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import pw.productors.secondlesson.model.ThreadHandler;
import pw.productors.secondlesson.model.ThreadHandlerDb;
import pw.productors.secondlesson.model.ThreadHandlerUi;

@Module
public class ThreadModule {

    @Provides
    @IntoMap
    @StringKey("UI")
    ThreadHandler provideThreadHandlerUI() {
        return new ThreadHandlerUi();
    }

    @Provides
    @IntoMap
    @StringKey("DB")
    ThreadHandler provideThreadHandlerDb() {
        return new ThreadHandlerDb();
    }
}

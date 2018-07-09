package pw.productors.secondlesson.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import pw.productors.secondlesson.model.AnalyticsManager;
import pw.productors.secondlesson.model.EventHandler;
import pw.productors.secondlesson.model.Logger;

@Module
public class EventModule {

    @Provides
    @IntoSet
    EventHandler provideAnalyticsManager() {
        return new AnalyticsManager();
    }

    @Provides
    @IntoSet
    EventHandler provideLogger() {
        return new Logger();
    }
}

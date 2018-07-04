package pw.productors.dagger.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.dagger.model.NetworkUtils;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}

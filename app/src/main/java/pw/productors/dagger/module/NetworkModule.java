package pw.productors.dagger.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.dagger.model.HttpClient;
import pw.productors.dagger.model.NetworkUtils;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils(HttpClient httpClient) {
        return new NetworkUtils(httpClient);
    }

    @Provides
    HttpClient provideHttpClient() {
        return new HttpClient();
    }
}

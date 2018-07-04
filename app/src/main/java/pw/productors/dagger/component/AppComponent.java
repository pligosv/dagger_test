package pw.productors.dagger.component;

import dagger.Component;
import pw.productors.dagger.model.DatabaseHelper;
import pw.productors.dagger.model.NetworkUtils;
import pw.productors.dagger.module.NetworkModule;
import pw.productors.dagger.module.StorageModule;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {

    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();
}

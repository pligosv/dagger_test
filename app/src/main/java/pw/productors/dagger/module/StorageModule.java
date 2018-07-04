package pw.productors.dagger.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.dagger.model.DatabaseHelper;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDataBaseHelper(){
        return new DatabaseHelper();
    }
}

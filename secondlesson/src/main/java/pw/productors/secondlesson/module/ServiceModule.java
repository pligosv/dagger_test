package pw.productors.secondlesson.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import pw.productors.secondlesson.model.ServiceHandler;
import pw.productors.secondlesson.model.ServiceHandlerDb;
import pw.productors.secondlesson.model.ServiceHandlerUI;
import pw.productors.secondlesson.qualifier.ServiceHandlerType;
import pw.productors.secondlesson.qualifier.ServiceHandlerTypeKey;

@Module
public class ServiceModule {

    @Provides
    @IntoMap
    @ServiceHandlerTypeKey(ServiceHandlerType.AAA)
    ServiceHandler provideServiceHandleAAA() {
        return new ServiceHandlerDb();
    }

    @Provides
    @IntoMap
    @ServiceHandlerTypeKey(ServiceHandlerType.BBB)
    ServiceHandler provideServiceHandlerBBB() {
        return new ServiceHandlerUI();
    }
}

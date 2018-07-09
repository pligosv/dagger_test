package pw.productors.secondlesson.qualifier;

import dagger.MapKey;

@MapKey
public @interface ServiceHandlerTypeKey {
    ServiceHandlerType value();
}

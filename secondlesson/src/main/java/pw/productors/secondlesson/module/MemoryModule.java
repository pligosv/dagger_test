package pw.productors.secondlesson.module;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import pw.productors.secondlesson.model.MemoryHandler;
import pw.productors.secondlesson.model.MemoryLogger;
import pw.productors.secondlesson.model.MemoryManager;
import pw.productors.secondlesson.model.MemoryWorker;

@Module
public class MemoryModule {

    @Provides
    @ElementsIntoSet
    Set<MemoryHandler> provideHandlers(){
        return new HashSet<>(Arrays.asList(new MemoryManager(), new MemoryLogger(), new MemoryWorker()));
    }
}

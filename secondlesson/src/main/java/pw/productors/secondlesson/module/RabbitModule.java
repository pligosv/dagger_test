package pw.productors.secondlesson.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.secondlesson.model.Rabbit;
import pw.productors.secondlesson.qualifier.RabbitGrey;
import pw.productors.secondlesson.qualifier.RabbitWhite;

@Module
public class RabbitModule {

    @RabbitGrey
    @Provides
    Rabbit provideGreyRabbit() {
        return new Rabbit("Серый кролик");
    }

    @RabbitWhite
    @Provides
    Rabbit provideWhiteRabbit() {
        return new Rabbit("Белый кролик");
    }
}

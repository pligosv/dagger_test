package pw.productors.dagger.module;

import dagger.Module;
import dagger.Provides;
import pw.productors.dagger.model.Food;
import pw.productors.dagger.model.Water;

@Module
public class FoodModule {

    @Provides
    Food provideFood(Water water) {
        return new Food(water);
    }

    @Provides
    Water provideWater() {
        return new Water();
    }
}

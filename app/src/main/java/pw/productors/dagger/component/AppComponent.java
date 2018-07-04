package pw.productors.dagger.component;

import dagger.Component;
import pw.productors.dagger.MainActivity;
import pw.productors.dagger.model.DatabaseHelper;
import pw.productors.dagger.model.NetworkUtils;
import pw.productors.dagger.module.FoodModule;
import pw.productors.dagger.module.NetworkModule;
import pw.productors.dagger.module.StorageModule;

@Component(modules = {StorageModule.class, NetworkModule.class, FoodModule.class})
public interface AppComponent {

//    Обычный способ через геттеры. Неудобно, если у нас 20 объектов = 20 геттеров
    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();

//    получение объектов через инжект
    void injectsMainActivity(MainActivity mainActivity);
}

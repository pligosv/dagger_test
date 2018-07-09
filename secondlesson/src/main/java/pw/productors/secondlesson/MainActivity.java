package pw.productors.secondlesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;
import pw.productors.secondlesson.model.Animal;
import pw.productors.secondlesson.model.Bird;
import pw.productors.secondlesson.model.EventHandler;
import pw.productors.secondlesson.model.MemoryHandler;
import pw.productors.secondlesson.model.Panda;
import pw.productors.secondlesson.model.Pig;
import pw.productors.secondlesson.model.Rabbit;
import pw.productors.secondlesson.model.ServiceHandler;
import pw.productors.secondlesson.model.ThreadHandler;
import pw.productors.secondlesson.qualifier.RabbitGrey;
import pw.productors.secondlesson.qualifier.RabbitWhite;
import pw.productors.secondlesson.qualifier.ServiceHandlerType;

public class MainActivity extends AppCompatActivity {

    String TAG = "SPACETAG";

    @Inject
    Lazy<Animal> animalProvider;

    @Inject
    Provider<Bird> birdProvider;

    @Named("male")
    @Inject
    Panda pandaMale;

    @Named("female")
    @Inject
    Panda pandaFemale;

    @RabbitGrey
    @Inject
    Rabbit greyRabbit;

    @RabbitWhite
    @Inject
    Rabbit whiteRabbit;

    @Inject
    Set<EventHandler> eventHandlers;

    @Inject
    Set<MemoryHandler> memoryHandlers;

    @Inject
    Map<String, ThreadHandler> threadHandlerMap;

    @Inject
    Map<ServiceHandlerType, ServiceHandler> serviceHandlerMap;

    @Inject
    Pig pig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().injectMainActivity(this);

//      Lazy всегда возвращает один и тот же объект
        Animal animal1 = animalProvider.get();
        Animal animal2 = animalProvider.get();
        Log.d(TAG, "onCreate: animal 1 = " + animal1.toString());
        Log.d(TAG, "onCreate: animal 2 = " + animal2.toString());

//      Provider всегда возвращает РАЗНЫЕ объекты
        Bird bird1 = birdProvider.get();
        Bird bird2 = birdProvider.get();
        Log.d(TAG, "onCreate: bird 1 = " + bird1.toString());
        Log.d(TAG, "onCreate: bird 2 = " + bird2.toString());

//      Использование @Named для получения объектов с одним типом
        Log.d(TAG, "onCreate: panda male = " + pandaMale.getName());
        Log.d(TAG, "onCreate: panda female = " + pandaFemale.getName());

//      Своя аннотация для кроликов
        Log.d(TAG, "onCreate: grey rabbit = " + greyRabbit.getName());
        Log.d(TAG, "onCreate: white rabbit = " + whiteRabbit.getName());

//        Получаем 2 EventHandlers и помещаем в  сет обработчиков
        Log.d(TAG, "onCreate: event set count = " + eventHandlers.size());

//        Получаем сразу сет обработчиков
        Log.d(TAG, "onCreate: memory set count = " + memoryHandlers.size());

//        Получаем мапу ThreadHandler
        for (Map.Entry<String, ThreadHandler> entry : threadHandlerMap.entrySet()) {
            Log.d(TAG, String.format("Thread Map Entry, %s - %s", entry.getKey(), entry.getValue().toString()));
        }

//        Получаем мапу ServiceHandler используя свои ключи
        for (Map.Entry<ServiceHandlerType, ServiceHandler> entry : serviceHandlerMap.entrySet()) {
            Log.d(TAG, String.format("Service Map Entry: %s - %s", entry.getKey(),entry.getValue()));
        }

//        Мы можем создать объект без модуля, используя @Inject на конструкторе
        pig.log();
    }

//    Вызовется после того как заинжектятся все поля
    @Inject
    void injectLodMethod() {
        Log.d(TAG, "injectLodMethod: in log");
    }
}

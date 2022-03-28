package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford();
        Mercedes mercedes = new Mercedes();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();

        cars.add(ford);
        cars.add(mercedes);
        cars.add(audi);
        cars.add(bmw);
        cars.add(lexus);
        cars.add(tesla);

        race(cars);

    }

    private static void race(List<Car> cars) {
        Car fastestCar = null;
        int maxSpeed = 0;
        int times = 10;
        for (Car car : cars) {
            car.startEngine();
            for (int i = 0; i < times; i++) {
                if (i == 2) {
                    if (car instanceof BoostCar) {
                        ((BoostCar) car).useNitrousOxideEngine();
                    }
                }
                car.speedUp();

                if (car.showCurrentSpeed().compareTo(String.valueOf(maxSpeed)) > 0) {
                    fastestCar = car;
                }
            }
        }
        System.out.println(fastestCar);
    }

}

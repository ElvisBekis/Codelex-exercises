package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class CarService {

    private final ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public ArrayList<Car> returnCarList() {
        return cars;
    }

    public ArrayList<Car> returnV12Cars() {
        ArrayList<Car> V12Cars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType().equals(EngineType.V12)) {
                V12Cars.add(car);
            }
        }
        return V12Cars;
    }

    public ArrayList<Car> returnOldCars() {
        ArrayList<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < 1999) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }

    public Car returnMostExpensiveCar() {
        Car mostExpensiveCar = null;
        BigDecimal max = BigDecimal.valueOf(0);
        for (Car car : cars) {
            if (car.getPrice().compareTo(max) > 0) {
                max = car.getPrice();
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car returnCheapestCar() {
        Car cheapestCar = null;
        BigDecimal min = BigDecimal.valueOf(Double.MAX_VALUE);
        for (Car car : cars) {
            if (car.getPrice().compareTo(min) < 0) {
                min = car.getPrice();
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public Car returnCarWithThreeManufacturers() {
        Car threeManufacturerCar = null;
        for (Car car : cars) {
            if (car.getManufacturerList().size() >= 3) {
                threeManufacturerCar = car;
            }
        }
        return threeManufacturerCar;
    }

    public void sortedByParameter(PassedParameter sortBy) {
        switch (sortBy) {
            case BY_PRICE_ASC -> cars.sort(Comparator.comparing(Car::getPrice));
            case BY_YEAR_ASC -> cars.sort(Comparator.comparing(Car::getYear));
            case BY_NAME_ASC -> cars.sort(Comparator.comparing(Car::getName));
            case BY_MODEL_ASC -> cars.sort(Comparator.comparing(Car::getModel));
            case BY_ENGINE_TYPE_ASC -> cars.sort(Comparator.comparing(Car::getEngineType));
            case BY_PRICE_DESC -> cars.sort(Comparator.comparing(Car::getPrice, Comparator.reverseOrder()));
            case BY_YEAR_DESC -> cars.sort(Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
            case BY_NAME_DESC -> cars.sort(Comparator.comparing(Car::getName, Comparator.reverseOrder()));
            case BY_MODEL_DESC -> cars.sort(Comparator.comparing(Car::getModel, Comparator.reverseOrder()));
            case BY_ENGINE_TYPE_DESC -> cars.sort(Comparator.comparing(Car::getEngineType, Comparator.reverseOrder()));
        }
    }

    public void isCarOnList(Car car) {
        if (cars.contains(car)) {
            System.out.println("Car is on the list");
        } else {
            System.out.println("Car is not on the list");
        }
    }

    public ArrayList<Car> returnCarsByManufacturer(Manufacturer m1) {
        ArrayList<Car> specificManufacturer = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturerList().contains(m1)) {
                specificManufacturer.add(car);
            }
        }
        return specificManufacturer;
    }

    public ArrayList<Car> returnCarsChosen(int year, YearParameter parameter) {
        ArrayList<Car> carsChosen = new ArrayList<>();
        boolean canAdd = false;
        for (Car car : cars) {
            innerLoop:
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                switch (parameter) {
                    case FROM_GIVEN_YEAR -> canAdd = manufacturer.getYear() == year;
                    case NOT_FROM_GIVEN_YEAR -> {
                        canAdd = manufacturer.getYear() != year;
                        if (!canAdd) {
                            break innerLoop;
                        }
                    }
                    case FROM_GIVEN_YEAR_INCLUDING_ONWARDS -> canAdd = manufacturer.getYear() >= year;
                    case FROM_GIVEN_YEAR_ONWARDS -> canAdd = manufacturer.getYear() > year;
                    case TILL_GIVEN_YEAR -> canAdd = manufacturer.getYear() <= year;
                    case TILL_GIVEN_YEAR_INCLUDING -> canAdd = manufacturer.getYear() < year;
                }
            }
            if (canAdd) {
                carsChosen.add(car);
            }
        }
        return carsChosen;
    }
}

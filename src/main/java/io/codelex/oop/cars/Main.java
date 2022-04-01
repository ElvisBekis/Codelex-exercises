package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarService service = new CarService();

        Manufacturer m1 = new Manufacturer("Ford", 1903, "USA");
        Manufacturer m2 = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer m3 = new Manufacturer("Audi", 1909, "Germany");

        Car c1 = new Car("Ford", "Mustang", BigDecimal.valueOf(50000), 1969, List.of(m1, m2, m3), EngineType.V8);
        Car c2 = new Car("Ford", "Mondeo", BigDecimal.valueOf(30000), 2015, List.of(m1), EngineType.V6);
        Car c3 = new Car("Ford", "Ranger", BigDecimal.valueOf(70000), 2022, List.of(m1), EngineType.V12);
        Car c4 = new Car("Ford", "Ranger", BigDecimal.valueOf(80000), 2022, List.of(m1), EngineType.V12);
        Car c5 = new Car("Ford", "Ranger", BigDecimal.valueOf(90000), 2022, List.of(m1), EngineType.V12);

        service.addCar(c1);
        service.addCar(c2);
        service.addCar(c3);
        service.addCar(c4);
        service.addCar(c5);
        service.removeCar(c3);
        service.returnCarList().forEach(System.out::println);
        System.out.println();
        service.returnV12Cars().forEach(System.out::println);
        System.out.println();
        System.out.println(service.returnMostExpensiveCar());
        System.out.println();
        System.out.println(service.returnCheapestCar());
        System.out.println();
        System.out.println(service.returnCarWithThreeManufacturers());
        System.out.println();
        service.sortedByParameter(PassedParameter.BY_PRICE_DESC);
        service.returnCarList().forEach(System.out::println);
        System.out.println();
        service.isCarOnList(c3);
        System.out.println();
        service.returnCarsByManufacturer(m2).forEach(System.out::println);
        System.err.println();
        System.out.println();
        service.returnCarsChosen(1937, YearParameter.NOT_FROM_GIVEN_YEAR).forEach(System.out::println);


    }
}

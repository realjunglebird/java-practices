package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        car.setYear(2007);
        electricCar.setYear(2020);
        car.setOwnerName("John Doe");
        electricCar.setOwnerName("Elon Musk");

        car.setInsuranceNumber(258269368);

        System.out.println(electricCar.getBatteryCapacity());

        System.out.println(car);
        System.out.println();
        System.out.println(electricCar);
    }
}
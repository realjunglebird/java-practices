package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle electricCar = new ElectricCar();

        System.out.println(car.vehicleType());
        System.out.println(electricCar.vehicleType());

        Car car2 = (Car) car;
        ElectricCar electricCar2 = (ElectricCar) electricCar;

        electricCar2.setBatteryCapacity(3553);
        ((ElectricCar) electricCar).setBatteryCapacity(535);
        //electricCar.setBatteryCapacity(535);

        System.out.println(electricCar2.getEngineType());
        System.out.println(electricCar2.getBatteryCapacity());
        System.out.println(((ElectricCar)electricCar).getBatteryCapacity());

    }
}
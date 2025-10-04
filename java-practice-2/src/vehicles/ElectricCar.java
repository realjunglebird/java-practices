package vehicles;

public class ElectricCar extends Car {
    int batteryCapacity;
    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int value) { batteryCapacity = value; }

    @Override
    public String vehicleType() {
        return "Electric car";
    }

    public ElectricCar() {
        engineType = "Electric";
    }
}

package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    int batteryCapacity;

    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int value) { batteryCapacity = value; }

    public ElectricCar() { engineType = "Electric"; }

    public String vehicleType() { return "Electric car"; }
}

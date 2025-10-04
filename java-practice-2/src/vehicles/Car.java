package vehicles;

public class Car extends Vehicle {
    protected String engineType;
    public String getEngineType() { return engineType; }
    public void setEngineType(String value) { engineType = value; }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
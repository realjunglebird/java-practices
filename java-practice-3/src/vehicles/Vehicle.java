package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    public String getModel() { return model; }
    public void setModel(String value) { model = value; }

    public String getLicense() { return license; }
    public void setLicense(String value) { license = value; }

    public String getColor() { return color; }
    public void setColor(String value) { color = value; }

    public int getYear() { return year; }
    public void setYear(int value) { year = value; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String value) { ownerName = value; }

    public int getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(int value) { insuranceNumber = value; }

    public String getEngineType() { return engineType; }
    public void setEngineType(String value) { engineType = value; }

    @Override
    public String toString() {
        return "Модель: " + model +
                "\nНомер: " + license +
                "\nЦвет: " + color +
                "\nГод: " + year +
                "\nИмя владельца: " + ownerName +
                "\nСтраховой номер: " + insuranceNumber +
                "\nТип двигателя: " + engineType;
    }

    abstract String vehicleType();
}

public class Car {
    String model;
    String license;
    String color;
    int year;

    public void setModel(String value) { model = value; }
    public String getModel() { return model; }

    public void setLicense(String value) { license = value; }
    public String getLicense() { return license; }

    public void setColor(String value) { color = value; }
    public String getColor() { return color; }

    public void setYear(int value) { year = value; }
    public int getYear() { return year; }

    public Car() {
        model = "Ford Focus";
        license = "А777АА123";
        color = "red";
        year = 2003;
    }

    public Car(
            String model,
            String license,
            String color,
            int year
    ) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car(String model, String color) {
        this.model = model;
        license = "А777АА123";
        this.color = color;
        year = 2006;
    }

    @Override
    public String toString() {
        return model + "\n" +
                license + "\n" +
                color + "\n" +
                year + "\n";
    }

    public void printAge() {
        System.out.println("Возраст автомобиля: " + (2025 - year) + " лет");
    }
}
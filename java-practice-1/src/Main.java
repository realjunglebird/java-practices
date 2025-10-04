public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(
                "Subaru Forester",
                "white"
        );
        Car car3 = new Car(
                "Ferrari Superfast",
                "Р739ТН777",
                "Red",
                1988
        );

        System.out.println("Задача №3");
        System.out.println("Вызов метода toString:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println("Получение возраста автомобиля:");
        car1.printAge();
        car2.printAge();
        car3.printAge();

        System.out.println("Проверка геттеров/сеттеров:");
        System.out.println(car1.getColor());
        car1.setColor("Green");
        System.out.println(car1.getColor());
        System.out.println(car3.getYear());
        car3.setYear(2023);
        System.out.println(car3.getYear());

    }
}
class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD плеер включён.");
    }

    public void turnOff() {
        System.out.println("DVD плеер отключён.");
    }

    public void play(String movieName) {
        System.out.println("Воспроизведение DVD с фильмом '" + movieName + "'.");
    }
}

class Projector {
    public void turnOn() {
        System.out.println("Проектор включён.");
    }

    public void turnOff() {
        System.out.println("Проектор отключён.");
    }

    public void setInput(String input) {
        System.out.println("Вход проектора установлен на " + input + ".");
    }
}

class SoundSystem {
    public void turnOn() {
        System.out.println("Звуковая система включена.");
    }

    public void turnOff() {
        System.out.println("Звуковая система отключена.");
    }

    public void setVolume(int volume) {
        System.out.println("Громкость звука установлена на " + volume + ".");
    }
}

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.dvd = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    public void watchMovie(String movieName) {
        System.out.println("Начало просмотра фильма '" + movieName + "'.");

        projector.turnOn();
        projector.setInput("DVD");

        soundSystem.turnOn();
        soundSystem.setVolume(85);

        dvd.turnOn();
        dvd.play(movieName);
    }

    public void endMovie() {
        System.out.println("Завершение просмотра фильма.");

        dvd.turnOff();
        soundSystem.turnOff();
        projector.turnOff();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Star Wars");
        homeTheater.endMovie();
    }
}

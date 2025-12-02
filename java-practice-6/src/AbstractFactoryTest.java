interface Button {
    void draw();
}

interface Checkbox {
    void draw();
}

class WinButton implements Button {
    @Override
    public void draw() {
        System.out.println("Отрисовка кнопки в стиле Windows");
    }
}

class WinCheckbox implements Checkbox {
    @Override
    public void draw() {
        System.out.println("Отрисовка чекбокса в стиле Windows");
    }
}

class MacButton implements Button {
    @Override
    public void draw() {
        System.out.println("Отрисовка кнопки в стиле macOS");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void draw() {
        System.out.println("Отрисовка чекбокса в стиле macOS");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void drawGUI() {
        button.draw();
        checkbox.draw();
    }
}

public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("Создание компонентов Windows:");
        Application windowsApp = new Application(new WindowsGUIFactory());
        windowsApp.drawGUI();

        System.out.println("Создание компонентов macOS:");
        Application macApp = new Application(new MacGUIFactory());
        macApp.drawGUI();
    }
}
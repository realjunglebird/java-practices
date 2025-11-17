public interface Button {
    void draw();
    String getPlatform();
}

interface Checkbox {
    void draw();
    String getPlatform();
}

class WinButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing Windows style button");
    }

    @Override
    public String getPlatform() {
        return "Windows";
    }
}

class WinCheckbox implements Checkbox {
    @Override
    public void draw() {
        System.out.println("Drawing windows checkbox");
    }

    @Override
    public String getPlatform() {
        return "Windows";
    }
}

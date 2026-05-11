interface SmartDevice {
    void turnOn();
    void playMusic();
    void makeCall();
}

class SmartLamp implements SmartDevice {
    public void turnOn() {
        System.out.println("Lamp is on");
    }

    public void playMusic() {
        throw new UnsupportedOperationException();
    }

    public void makeCall() {
        throw new UnsupportedOperationException();
    }
}

public class Firman {
    public static void main(String[] args) {
        SmartDevice lamp = new SmartLamp();
        lamp.turnOn();
    }
}
interface Switchable {
    void turnOn();
}

interface MusicPlayer {
    void playMusic();
}

interface Callable {
    void makeCall();
}

class SmartLamp implements Switchable {
    public void turnOn() {
        System.out.println("Lamp is on");
    }
}

class SmartSpeaker implements Switchable, MusicPlayer {
    public void turnOn() {
        System.out.println("Speaker is on");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class Smartphone implements Switchable, MusicPlayer, Callable {
    public void turnOn() {
        System.out.println("Phone is on");
    }

    public void playMusic() {
        System.out.println("Playing music on phone...");
    }

    public void makeCall() {
        System.out.println("Calling someone...");
    }
}

public class Firman {
    public static void main(String[] args) {
        Switchable lamp = new SmartLamp();
        lamp.turnOn();

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.turnOn();
        speaker.playMusic();

        Smartphone phone = new Smartphone();
        phone.turnOn();
        phone.playMusic();
        phone.makeCall();
    }
}
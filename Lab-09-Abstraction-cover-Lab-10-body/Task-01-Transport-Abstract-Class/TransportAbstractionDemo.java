abstract class Transport {
    public abstract void move();

    public void fuelType() {
        System.out.println("Uses fuel or electricity.");
    }
}

class Train extends Transport {
    @Override
    public void move() { System.out.println("Train runs on tracks."); }
}

class Airplane extends Transport {
    @Override
    public void move() { System.out.println("Airplane flies in the sky."); }
}

public class TransportAbstractionDemo {
    public static void main(String[] args) {
        Transport train = new Train();
        Transport airplane = new Airplane();

        train.move();
        train.fuelType();
        airplane.move();
        airplane.fuelType();
    }
}

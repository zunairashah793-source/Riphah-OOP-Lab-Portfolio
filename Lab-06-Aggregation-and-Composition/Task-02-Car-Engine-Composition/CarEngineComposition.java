class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private final Engine engine;

    public Car() {
        // The Car creates and owns its Engine internally: composition.
        engine = new Engine();
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving.");
    }
}

public class CarEngineComposition {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

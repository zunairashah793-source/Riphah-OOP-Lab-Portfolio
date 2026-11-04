class Ride {
    public double calculateFare(int km) {
        return km * 25.0;
    }
}

class Bike extends Ride {
    @Override
    public double calculateFare(int km) { return km * 20.0; }
}

class Car extends Ride {
    @Override
    public double calculateFare(int km) { return km * 40.0; }
}

class Rickshaw extends Ride {
    @Override
    public double calculateFare(int km) { return km * 30.0; }
}

public class RideFareCalculator {
    public static void main(String[] args) {
        Ride[] rides = { new Bike(), new Car(), new Rickshaw() };
        String[] names = { "Bike", "Car", "Rickshaw" };
        int distance = 10;

        for (int i = 0; i < rides.length; i++) {
            System.out.printf("%s fare for %d km: Rs. %.2f%n",
                    names[i], distance, rides[i].calculateFare(distance));
        }
    }
}

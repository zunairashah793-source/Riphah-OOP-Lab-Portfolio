class CinemaHall {
    private int bookedSeats = 0;
    private final int capacity;

    public CinemaHall(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive.");
        this.capacity = capacity;
    }

    public void bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            System.out.println("Seat booked successfully.");
        } else {
            System.out.println("No seats remaining.");
        }
    }

    public void cancelBooking() {
        if (bookedSeats > 0) {
            bookedSeats--;
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("There are no bookings to cancel.");
        }
    }

    public void showStatus() {
        System.out.println("Booked seats: " + bookedSeats);
        System.out.println("Remaining seats: " + (capacity - bookedSeats));
    }
}

public class CinemaTicketCounter {
    public static void main(String[] args) {
        CinemaHall hall = new CinemaHall(100);
        for (int i = 0; i < 5; i++) hall.bookSeat();
        for (int i = 0; i < 2; i++) hall.cancelBooking();
        System.out.println("\n--- Cinema Hall Status ---");
        hall.showStatus();
    }
}

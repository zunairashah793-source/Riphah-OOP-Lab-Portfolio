class Hospital {
    public void book(String patientName) {
        System.out.println("Appointment booked for " + patientName + " with a general doctor today.");
    }

    public void book(String patientName, String doctorName) {
        System.out.println("Appointment booked for " + patientName + " with Dr. " + doctorName + " today.");
    }

    public void book(String patientName, String doctorName, int dayNumber) {
        System.out.println("Appointment booked for " + patientName + " with Dr. " + doctorName
                + " on day " + dayNumber + ".");
    }
}

public class HospitalAppointments {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.book("Ayesha");
        hospital.book("Bilal", "Khan");
        hospital.book("Sara", "Ahmed", 15);
    }
}

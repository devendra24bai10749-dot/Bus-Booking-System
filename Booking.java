public class Booking {
    int bookingId;
    int busId;
    int seatNo;
    String passengerName;

    public Booking(int bookingId, int busId, int seatNo, String passengerName) {
        this.bookingId = bookingId;
        this.busId = busId;
        this.seatNo = seatNo;
        this.passengerName = passengerName;
    }

    public void showBooking() {
        System.out.println("\n===== BOOKING DETAILS =====");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Bus ID: " + busId);
        System.out.println("Seat No: " + seatNo);
        System.out.println("===========================");
    }
}
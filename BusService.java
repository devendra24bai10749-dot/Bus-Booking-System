import java.util.ArrayList;

public class BusService {

    ArrayList<Bus> buses = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    int bookingCounter = 1;

    public BusService() {
        // Sample buses
        buses.add(new Bus(1, "Bhopal", "Indore", 500, 10));
        buses.add(new Bus(2, "Bhopal", "Delhi", 1200, 10));
        buses.add(new Bus(3, "Indore", "Mumbai", 1500, 10));
    }

    // Show all buses
    public void showBuses() {
        for (Bus b : buses) {
            b.showBus();
        }
    }

    // Book ticket
    public void bookTicket(int busId, int seatNo, String name) {

        for (Bus b : buses) {
            if (b.busId == busId) {

                if (seatNo < 1 || seatNo > b.seats.length) {
                    System.out.println("❌ Invalid seat number!");
                    return;
                }

                if (!b.seats[seatNo - 1]) {
                    b.seats[seatNo - 1] = true;

                    Booking bk = new Booking(bookingCounter++, busId, seatNo, name);
                    bookings.add(bk);

                    System.out.println("\n✅ Booking Successful!");
                    bk.showBooking();
                } else {
                    System.out.println("❌ Seat already booked!");
                }
                return;
            }
        }

        System.out.println("❌ Bus not found!");
    }

    // Cancel ticket
    public void cancelTicket(int bookingId) {

        for (Booking bk : bookings) {

            if (bk.bookingId == bookingId) {

                for (Bus b : buses) {
                    if (b.busId == bk.busId) {
                        b.seats[bk.seatNo - 1] = false;
                        break;
                    }
                }

                bookings.remove(bk);
                System.out.println("✅ Booking Cancelled Successfully!");
                return;
            }
        }

        System.out.println("❌ Booking not found!");
    }

    // Show all bookings
    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Booking b : bookings) {
            b.showBooking();
        }
    }
}
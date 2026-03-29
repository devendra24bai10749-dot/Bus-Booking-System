public class Bus {
    int busId;
    String source;
    String destination;
    double fare;
    boolean[] seats;

    public Bus(int busId, String source, String destination, double fare, int capacity) {
        this.busId = busId;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.seats = new boolean[capacity]; // false = available
    }

    public void showBus() {
        System.out.println("\n----------------------");
        System.out.println("Bus ID: " + busId);
        System.out.println("Route: " + source + " -> " + destination);
        System.out.println("Fare: " + fare);

        System.out.print("Available Seats: ");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println("\n----------------------");
    }
}
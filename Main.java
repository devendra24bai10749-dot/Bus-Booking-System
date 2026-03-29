import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BusService service = new BusService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== BUS TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.showBuses();
                    break;

                case 2:
                    System.out.print("Enter Bus ID: ");
                    int busId = sc.nextInt();

                    System.out.print("Enter Seat Number: ");
                    int seatNo = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    service.bookTicket(busId, seatNo, name);
                    break;

                case 3:
                    System.out.print("Enter Booking ID: ");
                    int id = sc.nextInt();

                    service.cancelTicket(id);
                    break;

                case 4:
                    service.showBookings();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
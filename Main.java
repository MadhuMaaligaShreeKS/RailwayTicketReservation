import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicketReservationSystem ticketReservationSystem = new TicketReservationSystem();
        Scanner scanner = new Scanner(System.in);
        
        Train train1 = new Train("Chennai to Madurai Express", 100, 50, 20, 30);
        Train train2 = new Train("Bangalore to Madurai Superfast", 150, 70, 30, 40);
        Train train3 = new Train("Delhi to Chennai Duronto", 120, 60, 25, 35);
        Train train4 = new Train("Hyderabad to Kolkata Mail", 200, 80, 40, 60);
        Train train5 = new Train("Mumbai to Pune Shatabdi", 80, 40, 15, 25);

        ticketReservationSystem.addTrain(train1);
        ticketReservationSystem.addTrain(train2);
        ticketReservationSystem.addTrain(train3);
        ticketReservationSystem.addTrain(train4);
        ticketReservationSystem.addTrain(train5);

        int choice;
        do {
            // Prompt user for choice
            System.out.println("\nEnter your choice:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Available Trains");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter train number (1-" + ticketReservationSystem.getTrains().size() + "): ");
                    int trainNumber = scanner.nextInt();
                    System.out.println("Enter number of tickets: ");
                    int numTickets = scanner.nextInt();
                    System.out.println("Enter ticket type (Seat, Berth, Sleeper, AC): ");
                    String ticketType = scanner.next();
                    ticketReservationSystem.bookTicket(trainNumber - 1, numTickets, ticketType);
                    break;
                case 2:
                    System.out.println("Enter train number (1-" + ticketReservationSystem.getTrains().size() + "): ");
                    int cancelTrainNumber = scanner.nextInt();
                    System.out.println("Enter number of tickets to cancel: ");
                    int cancelNumTickets = scanner.nextInt();
                    System.out.println("Enter ticket type to cancel (Seat, Berth, Sleeper, AC): ");
                    String cancelTicketType = scanner.next();
                    ticketReservationSystem.cancelTicket(cancelTrainNumber - 1, cancelNumTickets, cancelTicketType);
                    break;
                case 3:
                    ticketReservationSystem.displayAvailableTrains();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            
        }while (choice != 4);
    }
}

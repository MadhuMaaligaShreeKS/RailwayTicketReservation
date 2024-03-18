import java.util.*;
public class TicketReservationSystem {
    private List<Train> trains;

    public TicketReservationSystem() {
        trains = new ArrayList<>();
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void displayAvailableTrains() {
        System.out.println("Available Trains:");
        for (int i = 0; i < trains.size(); i++) {
            System.out.println((i + 1) + ". " + trains.get(i).getTrainName() + " - Available Seats: " + trains.get(i).getAvailableSeats() +
                    ", Berths: " + trains.get(i).getAvailableBerths() + ", Sleeper Seats: " + trains.get(i).getAvailableSleeperSeats() +
                    ", AC Seats: " + trains.get(i).getAvailableACSeats());
        }
    }

    public void bookTicket(int trainIndex, int numTickets, String ticketType) {
        if (trainIndex >= 0 && trainIndex < trains.size()) {
            trains.get(trainIndex).bookTicket(numTickets, ticketType);
        } else {
            System.out.println("Invalid train number.");
        }
    }

    public void cancelTicket(int trainIndex, int numTickets, String ticketType) {
        if (trainIndex >= 0 && trainIndex < trains.size()) {
            trains.get(trainIndex).cancelTicket(numTickets, ticketType);
        } else {
            System.out.println("Invalid train number.");
        }
    }
}

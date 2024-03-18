public class Train {
    private String trainName;
    private int availableSeats;
    private int availableBerths;
    private int availableSleeperSeats;
    private int availableACSeats;

    public Train(String trainName, int availableSeats, int availableBerths, int availableSleeperSeats, int availableACSeats) {
        this.trainName = trainName;
        this.availableSeats = availableSeats;
        this.availableBerths = availableBerths;
        this.availableSleeperSeats = availableSleeperSeats;
        this.availableACSeats = availableACSeats;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getAvailableBerths() {
        return availableBerths;
    }

    public int getAvailableSleeperSeats() {
        return availableSleeperSeats;
    }

    public int getAvailableACSeats() {
        return availableACSeats;
    }

 private int bookedSeats = 0;
    private int bookedBerths = 0;
    private int bookedSleeperSeats = 0;
    private int bookedACSeats = 0;

    public void bookTicket(int numTickets, String ticketType) {
        switch (ticketType.toLowerCase()) {
            case "seat":
                if (numTickets <= availableSeats) {
                    availableSeats -= numTickets;
                    bookedSeats += numTickets;
                    System.out.println(numTickets + " seat(s) booked successfully for train " + trainName);
                } else {
                    System.out.println("Sorry, insufficient seats available for booking in train " + trainName);
                }
                break;
            case "berth":
                if (numTickets <= availableBerths) {
                    availableBerths -= numTickets;
                    bookedBerths += numTickets;
                    System.out.println(numTickets + " berth(s) booked successfully for train " + trainName);
                } else {
                    System.out.println("Sorry, insufficient berths available for booking in train " + trainName);
                }
                break;
            // Similar logic for sleeper seats and AC seats
            default:
                System.out.println("Invalid ticket type");
        }
    }

    public void cancelTicket(int numTickets, String ticketType) {
        switch (ticketType.toLowerCase()) {
            case "seat":
                if (bookedSeats >= numTickets) {
                    availableSeats += numTickets;
                    bookedSeats -= numTickets;
                    System.out.println(numTickets + " seat(s) canceled successfully for train " + trainName);
                } else {
                    System.out.println("You have not booked " + numTickets + " seat(s) in train " + trainName);
                }
                break;
            case "berth":
                if (bookedBerths >= numTickets) {
                    availableBerths += numTickets;
                    bookedBerths -= numTickets;
                    System.out.println(numTickets + " berth(s) canceled successfully for train " + trainName);
                } else {
                    System.out.println("You have not booked " + numTickets + " berth(s) in train " + trainName);
                }
                break;
            case "sleeper":
                if (bookedBerths >= numTickets) {
                    availableBerths += numTickets;
                    bookedBerths -= numTickets;
                    System.out.println(numTickets + " sleeper(s) canceled successfully for train " + trainName);
                } else {
                    System.out.println("You have not booked " + numTickets + " sleeper(s) in train " + trainName);
                }
                break;
            case "ac":
                if (bookedBerths >= numTickets) {
                    availableBerths += numTickets;
                    bookedBerths -= numTickets;
                    System.out.println(numTickets + " ac canceled successfully for train " + trainName);
                } else {
                    System.out.println("You have not booked " + numTickets + " ac in train " + trainName);
                }
                break;
            
            default:
                System.out.println("Invalid ticket type");
        }
    }
}

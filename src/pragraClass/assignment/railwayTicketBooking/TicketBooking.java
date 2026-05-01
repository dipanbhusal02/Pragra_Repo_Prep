package pragraClass.assignment.railwayTicketBooking;

public class TicketBooking {
    int availableSeats = 2;
    int walletBalance = 1000;

    void bookTicket(Passenger p, int fair) throws InsufficientBalanceException, InvalidAgeException, SeatNotAvailableException {
        if (p.age < 18) {
            throw new InvalidAgeException("The passenger is Underage");
        }
        if (walletBalance < fair) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        if (availableSeats == 0) {
            throw new SeatNotAvailableException("Seat not Available");
        }
        availableSeats--;
        walletBalance-=fair;
        System.out.println("Seat Booked for " + p.name + " at the price " + fair + "$");

    }
}

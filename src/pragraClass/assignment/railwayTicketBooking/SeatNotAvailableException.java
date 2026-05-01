package pragraClass.assignment.railwayTicketBooking;

public class SeatNotAvailableException extends Exception{
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

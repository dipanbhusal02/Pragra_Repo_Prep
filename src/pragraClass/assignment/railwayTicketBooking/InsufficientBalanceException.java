package pragraClass.assignment.railwayTicketBooking;

public class InsufficientBalanceException extends  Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

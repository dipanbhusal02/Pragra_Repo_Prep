package pragraClass.assignment.railwayTicketBooking;

import pragraClass.march21OOPs.Person;

public class Main {
    public static void main(String[] args) {
        int fair=50;
        Passenger passenger1 = new Passenger("Dipan",17);
        Passenger passenger2 = new Passenger("Sam", 33);

        TicketBooking booking = new TicketBooking();
        try {
            booking.bookTicket(passenger2, fair);
            booking.bookTicket(passenger2, fair);



        }
        catch (InvalidAgeException|InsufficientBalanceException|SeatNotAvailableException a){
            System.out.println(a.getMessage());
        }


    }
}

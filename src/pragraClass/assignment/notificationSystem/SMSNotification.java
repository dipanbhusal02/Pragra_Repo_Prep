package pragraClass.assignment.notificationSystem;

public class SMSNotification extends Notification{
    @Override
    void sent() {
        System.out.println("You have a SMS message");
    }
}

package pragraClass.assignment.notificationSystem;

public class EmailNotification extends Notification{
    @Override
    void sent() {
        System.out.println("You have an Email");
    }
}

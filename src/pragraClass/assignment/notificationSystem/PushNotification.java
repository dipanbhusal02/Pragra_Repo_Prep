package pragraClass.assignment.notificationSystem;

public class PushNotification extends Notification{
    @Override
    void sent() {
        System.out.println("You have a push Notification");
    }
}

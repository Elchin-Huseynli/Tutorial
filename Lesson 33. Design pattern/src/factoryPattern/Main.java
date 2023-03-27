package factoryPattern;

public class Main {
    public static void main(String[] args) {
        FactoryNotification notify = new FactoryNotification();
        Notification notification = notify.getNotification("push");

        notification.notifyUser();
    }
}

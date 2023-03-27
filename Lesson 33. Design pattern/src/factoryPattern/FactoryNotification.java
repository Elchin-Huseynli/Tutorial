package factoryPattern;

public class FactoryNotification {
    public Notification getNotification(String channel) {
        switch (channel.toLowerCase()) {
            case "sms":
                return new SmsNotification();
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            default:
                System.out.println("Channel not found!");
        }
        return null;
    }
}

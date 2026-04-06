// Notification Interface
interface Notification {
    void sendMessage();
}

// Email Notification
class EmailNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending Email Notification");
    }
}

// SMS Notification
class SMSNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending SMS Notification");
    }
}

// Push Notification
class PushNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending Push Notification");
    }
}

// Abstract Factory
abstract class NotificationFactory {
    abstract Notification createNotification();
}

// Email Factory
class EmailNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}

// SMS Factory
class SMSNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}

// Push Factory
class PushNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new PushNotification();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Email Notification
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification();
        email.sendMessage();

        // SMS Notification
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.sendMessage();

        // Push Notification
        NotificationFactory pushFactory = new PushNotificationFactory();
        Notification push = pushFactory.createNotification();
        push.sendMessage();
    }
}
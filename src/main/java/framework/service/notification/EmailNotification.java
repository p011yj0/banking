package framework.service.notification;


public abstract class EmailNotification extends Notification {

    public EmailNotification() {
        super("This is an Email notification object");
    }

    public void sendEmail(String from, String to, String message) {
        System.out.println("Email to " + to + " with message [" + message + "] has been sent!");
        System.out.println("Our email address is " + from);
    }
}

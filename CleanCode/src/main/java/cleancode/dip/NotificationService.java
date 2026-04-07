package cleancode.dip;

public class NotificationService {
    private MessageSendable messageSender;

    public NotificationService(MessageSendable messageSendable) {
        this.messageSender = messageSendable;
    }

    public void sendNotification(String message) {
        messageSender.sendEmail(message);
    }
}

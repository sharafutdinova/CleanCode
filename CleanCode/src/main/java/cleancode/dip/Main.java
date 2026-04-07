package cleancode.dip;

public class Main {
    static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.sendNotification("Email message");
    }
}

package cleancode.dip;

class EmailSender implements MessageSendable{
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}

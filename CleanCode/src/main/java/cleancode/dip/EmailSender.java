package cleancode.dip;

class EmailSender implements MessageSendable{
    public void sendMessage(String message) {
        System.out.println("Отправка email: " + message);
    }
}

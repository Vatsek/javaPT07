package org.example;

public class MobilePhone extends StationaryPhone implements IncomingCall, OutgoingCall,
        SendSMS, IncomingSMS, SendEmail, incomingEmail {
    public MobilePhone(String model) {
        super(model);
    }
    @Override
    public void incomingCall() {
        System.out.println("Входящий вызов");
    }
    @Override
    public void outgoingCall() {
        System.out.println("Исходящий вызов");
    }
    @Override
    public void sendSMS() {
        System.out.println("Сообщение отправлено");
    }
    @Override
    public void incomingSms() {
        System.out.println("Получено новое сообщение");
    }

    @Override
    public void sendEmail() {
        System.out.println("Сообщение по эл.почте отправлено");
    }

    @Override
    public void incomingEmail() {
        System.out.println("Получено новое сообщение на эл. почту");
    }
}

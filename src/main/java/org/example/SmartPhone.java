package org.example;

public class SmartPhone extends MobilePhone implements IncomingCall, OutgoingCall,
        SendSMS, IncomingSMS, SendEmail, incomingEmail, AppStore {
    public SmartPhone(String model) {
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

    @Override
    public void appStore() {
        System.out.println("Магазин приложений запускается");
    }
}

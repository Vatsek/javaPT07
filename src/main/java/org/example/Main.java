package org.example;

public class Main {
    public static void main(String[] args)
    {
        StationaryPhone ph1 = new StationaryPhone("Panasonic");
        MobilePhone ph2 = new MobilePhone("Nokia");
        SmartPhone ph3 = new SmartPhone("iPhone");
        System.out.println(ph1.getModel());
        System.out.println(ph2.getModel());
        System.out.println(ph3.getModel());
        ph1.incomingCall();
        ph2.incomingCall();
        ph3.incomingCall();
        ph1.outgoingCall();
        ph2.outgoingCall();
        ph3.outgoingCall();
        ph2.incomingSms();
        ph3.incomingSms();
        ph2.sendSMS();
        ph3.sendSMS();
        ph2.sendEmail();
        ph3.sendEmail();
        ph2.incomingEmail();
        ph3.incomingEmail();
        ph3.appStore();
    }
}
package org.example;

public class StationaryPhone extends Phone implements IncomingCall, OutgoingCall {
    public StationaryPhone(String model) {
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
}

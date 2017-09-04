package io.github.rymanalu;

public class Main {

    public static void main(String[] args) {
        ITelephone roniPhone = new DeskPhone(123456);
        roniPhone.powerOn();
        roniPhone.callPhone(123456);
        roniPhone.answer();

        roniPhone = new MobilePhone(24565);
        roniPhone.powerOn();
        roniPhone.callPhone(24565);
        roniPhone.answer();
    }
}

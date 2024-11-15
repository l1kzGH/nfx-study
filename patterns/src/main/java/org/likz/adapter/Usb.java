package org.likz.adapter;

public class Usb implements IDataTransmitter{

    @Override
    public void connect() {
        System.out.println("USB Connected");
    }

    @Override
    public String toString() {
        return "USB device";
    }
}

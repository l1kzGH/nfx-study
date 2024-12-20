package org.likz.adapter;

public class ExampleComputer implements IComputer{

    @Override
    public void read(IDataTransmitter deviceTransmitter) {
        deviceTransmitter.connect();

        System.out.println("Computer ready to read from: " + deviceTransmitter);
    }
}

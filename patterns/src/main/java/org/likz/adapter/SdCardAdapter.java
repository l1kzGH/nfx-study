package org.likz.adapter;

public class SdCardAdapter implements IDataTransmitter{

    private SdCard sdCard;

    public SdCardAdapter(SdCard sdCard){
        this.sdCard = sdCard;
    }

    @Override
    public void connect() {
        sdCard.connect();
    }

    @Override
    public String toString() {
        return sdCard.toString();
    }

}

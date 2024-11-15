package org.likz.adapter;

public class SdCard implements IMemoryCard{

    @Override
    public void connect() {
        System.out.println("SD-card Connected");
    }

    @Override
    public String toString() {
        return "SD-card";
    }
}

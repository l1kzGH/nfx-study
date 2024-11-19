package org.likz.adapter;

public interface IMemoryCard {
    void connect();

    /**
     * Methods for example different functionality of this interface
     */
    default void read() {}
    default void write() {}
}

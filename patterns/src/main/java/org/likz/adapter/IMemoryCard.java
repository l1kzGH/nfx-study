package org.likz.adapter;

public interface IMemoryCard {
    void connect();

    // another logic
    default void read() {};
    default void write() {};
}

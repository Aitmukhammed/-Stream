package com.company;

public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch) throws QueueFullException;
    // Извлечение символа из очереди
    char get() throws QueueEmptyException;
}

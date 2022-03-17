package com.company;

public class QueueEmptyException extends Exception{
    // Генерируется в случае попытки удалить элемент из пустой очереди.
    public String toString(){
        return "очередь пуста. ";
    }
}

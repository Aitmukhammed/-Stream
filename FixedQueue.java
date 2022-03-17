package com.company;


public class FixedQueue implements ICharQ{
    private char q[]; //массив для хранения элементов в очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    public FixedQueue(int size){
        q = new char[size]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    //помещение символа в очереди
    @Override
    public void put(char ch) throws QueueFullException {
        if(putloc==q.length)
            throw new QueueFullException(q.length);
        q[putloc++]=ch;
    }


    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
            return q[getloc++];
        }
}

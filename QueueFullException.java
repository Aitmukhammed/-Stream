package com.company;

public class QueueFullException extends  Exception {
    // В случае попытки сохранить элемент в уже заполненной
    // очереди генерируется исключение QueueFullExcept ion
    int size;
    QueueFullException(int s){
        size=s;
    }
    public String toString(){
        return "\nОчередь заполнена. Максимальный разме: "+size;
    }
}

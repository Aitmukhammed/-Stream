package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args)
        throws IOException{
        try{
            FileInputStream fin = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fin);

            human human1 = (human) ois.readObject();
            human human2 = (human) ois.readObject();

            System.out.println(human1);
            System.out.println(human2);

            ois.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

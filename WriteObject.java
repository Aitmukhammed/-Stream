package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args)
        throws IOException {
            human human1 = new human(1, "Bob");
            human human2 = new human(2, "Mike");

            try {
                FileOutputStream fout = new FileOutputStream("people.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(human1);
                oos.writeObject(human2);

                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

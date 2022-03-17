package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String args[])
            throws IOException {

        int ii = 0;
        int j = 0;
        if (args.length != 2) {
            System.out.println("Ispolzovanie failov first & second");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                ii = f1.read();
                j = f2.read();
                if (ii != j) break;
            } while (ii != -1 && j != -1);

            if (ii != j) System.out.println("Soderzimoe faylov otlichaetsiya");
            else System.out.println("Soderzhimoe failov sovpadaet");
        } catch (IOException exc) {
            System.out.println("ERROR vvod and vyvod " + exc);

        }
    }

}

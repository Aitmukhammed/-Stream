package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo{
    public static void main(String[] args)
        throws IOException{
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
            for(int i=0; i< data.length; i++){
                raf.writeDouble(data[i]);
            }
            //Считыввание отдельных значений из файлов
            raf.seek(0); //найти первое значений из файла
            d = raf.readDouble();
            System.out.println("First meaning: "+d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second meaning: "+d);

            raf.seek(8*3);
            d = raf.readDouble();
            System.out.println("Fourth meaning: "+d);

            System.out.println();

            System.out.println("Чтение значений с нечетными порядковыми номерами: ");
            for (int i=0; i< data.length; i+=2){
                raf.seek(8*i); //найти i - е значение типа double
                d = raf.readDouble();
                System.out.println(d+" ");
            }
        }catch (IOException e){
            System.out.println("Error vvod and vyvod");
        }
    }
}

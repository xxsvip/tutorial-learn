package vip.xingxiaoshuai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        demo1();
    }



    private static void demo1() throws IOException {
        FileInputStream input = new FileInputStream("a.txt");

        int data = input.read();
        while (data != -1){
            System.out.println((char)data);
            data = input.read();
        }

        input.close();
    }

    private static void demo2() throws IOException {
        try(FileInputStream input = new FileInputStream("a.txt")){
            int data = input.read();
            while (data != -1){
                System.out.println((char)data);
                data = input.read();
            }
        }
    }



}
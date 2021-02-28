package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyContainer arr = new MyContainer();
        for (int i=0; i<15; i++)
            arr.addNumber(in.nextInt());
        for (int i=0; i<15; i++)
            System.out.println(arr.getNumber(i));
    }
}

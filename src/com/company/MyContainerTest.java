package com.company;

import org.junit.Before;

import static org.junit.Assert.*;

public class MyContainerTest {

    int[] arr = {1, 2, 3, 4, 5};
    MyContainer example = new MyContainer(arr, 5);

    @org.junit.Test
    public void getNumber() {
        assertEquals(2, example.getNumber(1));
    }

    @org.junit.Test
    public void addNumber() {
        example.addNumber(6);
        assertEquals(6, example.getNumber(5));
    }

    @org.junit.Test
    public void deleteNumber() {
        example.deleteNumber(2);
        assertEquals(4, example.getNumber(2));
    }
}
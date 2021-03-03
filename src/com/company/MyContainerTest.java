package com.company;

import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class MyContainerTest {


        int[] arr = {1, 2, 3, 4, 5};
        MyContainer example = new MyContainer(arr);


    @org.junit.Test
    public void getNumber() {
        assertEquals(2, example.getNumber(1));
    }

    @org.junit.Test
    public void addNumber() {
        example.addNumber(6);
        int[] copy = example.getMyArray();
        int[] expected = {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, copy);
    }

    @org.junit.Test
    public void deleteNumber() {
        example.deleteNumber(2);
        int[]expected = {1, 2, 4, 5};
        int[]realArray = example.getMyArray();
        Assert.assertArrayEquals(expected, example.getMyArray());
    }
}
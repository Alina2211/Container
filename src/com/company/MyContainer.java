package com.company;

public class MyContainer {
    int size;
    int[] myArray;
    int quantity=0;
    MyContainer ()
    {
        size=10;
        myArray = new int[size];
    }
    MyContainer (int n)
    {
        size=n;
        myArray = new int[size];
    }
    public void addNumber(int x)
    {
        if (quantity==size)
        {
            arrayExtent();
        }
        myArray[quantity]= x;
        quantity++;
    }

    public int getNumber(int index)
    {
        if (index>=0 && index<quantity)
            return myArray[index];
        else
        {
            System.out.println("Index is out of range");
            return 0;
        }
    }

    public void deleteNumber(int index)
    {
        if (index>=0 && index<quantity)
        {
            for (int i=index; i<quantity-1; i++)
                myArray[i]=myArray[i+1];
        }
        else System.out.println("Index is out of range");
    }

    private void arrayExtent()
    {
        int[] copy = new int[size+10];
        for (int i=0; i<size; i++)
        {
            copy[i]=myArray[i];
        }
        size+=10;
        myArray = null;
        myArray = copy;
    }
}

package com.company;

/**
 * Класс хранения целых чисел со свойствами
 * @autor Губина Алина
 */
public class MyContainer {
    /** Поле - размер массива */
    int size;
    /** Поле - массив целых чисел*/
    int[] myArray;
    /** Поле - фактическое количество хранимых чисел в массиве*/
    int quantity=0;

    /**
     * Конструктор по умолчанию
     * @see MyContainer#MyContainer()
     */
    MyContainer ()
    {
        size=10;
        myArray = new int[size];
    }
    /**
     * Конструктор создания контейнера с заданным размером
     * @see MyContainer#MyContainer(int)
     */
    MyContainer (int n)
    {
        size=n;
        myArray = new int[size];
    }

    /**
     * Констуктор создания контейнера по заданному массиву
     * @see MyContainer#MyContainer(int[], int)
     */
    MyContainer (int[] arr, int n)
    {
        for (int i=0; i<n; i++)
        {
            if (quantity==size)
            {
                arrayExtent();
            }
            myArray[i]= arr[i];
            quantity++;
        }
    }
    /**
     * Метод добавления нового числа в контейнер
     * @param x - добавляемое значение
     */
    public void addNumber(int x)
    {
        if (quantity==size)
        {
            arrayExtent();
        }
        myArray[quantity]= x;
        quantity++;
    }
    /**
     * Метод получения элемента из контейнера по заданному индексу
     * @param index - индекс получаемого значения
     * @return возвращает элемент контейнера с индексом index
     */
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
    /**
     * Метод удаления элемента по заданному индексу
     * @param index - индекс удаляемого значения
     */
    public void deleteNumber(int index)
    {
        if (index>=0 && index<quantity)
        {
            for (int i=index; i<quantity-1; i++)
                myArray[i]=myArray[i+1];
        }
        else System.out.println("Index is out of range");
    }
    /**
     * Метод расширения массива
     */
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

package Classes;

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
    int quantity;

    /**
     * Конструктор по умолчанию
     * @see MyContainer#MyContainer()
     */
    public MyContainer ()
    {
        size=10;
        quantity=0;
        myArray = new int[size];
    }
    /**
     * Конструктор создания пустого контейнера с заданным размером
     * @see MyContainer#MyContainer(int)
     */
    public MyContainer (int n)
    {
        size=n;
        myArray = new int[size];
    }

    /**
     * Констуктор создания контейнера по заданному массиву
     * @see MyContainer#MyContainer(int[])
     */
    public MyContainer (int[] arr)
    {
        size = arr.length;
        quantity=arr.length;
        myArray = new int[size];
        for (int i=0; i<size; i++)
        {
            myArray[i]= arr[i];
        }
    }
    public int[] getMyArray(){
        int[] copy = new int[quantity];
        for (int i=0; i<quantity; i++)
            copy[i]=myArray[i];
        return copy;
    }

    public int getSize() {
        return size;
    }

    public int getQuantity(){
        return quantity;
    }
    /**
     * Метод добавления нового числа в контейнер
     * @param x - добавляемое значение
     */
    public void addNumber(int x)
    {
        if (quantity==size)
        {
            myArray=arrayExtent();
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
            throw new RuntimeException("Index is out of range");
        }
    }
    /**
     * Метод удаления элемента по заданному индексу
     * @param index - индекс удаляемого значения
     */
    public void deleteNumber(int index)
    {
        if (index>=0 && index<=quantity)
        {
            for (int i=index; i<quantity-1; i++)
                myArray[i]=myArray[i+1];
            quantity--;
        }
        throw new RuntimeException("Index is out of range");
    }
    /**
     * Метод расширения массива
     */
    public int[] arrayExtent()
    {
        int[] copy = new int[size+10];
        for (int i=0; i<size; i++)
        {
            copy[i]=myArray[i];
        }
        size+=10;
        return copy;
    }
}

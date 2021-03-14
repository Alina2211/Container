package Classes;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        MyContainer example = new MyContainer(arr1);

        int[] copy = example.getMyArray();
        for (int i=0; i<5; i++)
        {
            System.out.println(copy[i]);
        }
        example.addNumber(6);

        copy = example.getMyArray();
        for (int i=0; i<copy.length; i++)
        {
            System.out.println(copy[i]);
        }
    }
}

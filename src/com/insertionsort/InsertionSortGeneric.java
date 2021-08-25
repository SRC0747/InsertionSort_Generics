package com.insertionsort;

public class InsertionSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args)
    {
        // example using Strings
        String[]                     arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        InsertionSortGeneric<String> stringSorter   = new InsertionSortGeneric<>();
        stringSorter.insertionSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        // example using Doubles
        Double[]                     arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        InsertionSortGeneric<Double> doubleSorter   = new InsertionSortGeneric<>();
        doubleSorter.insertionSort(arrayOfDoubles);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }
    void insertionSort(T[] array)
    {
        // start at the first index and iterate through to the end
        for (int i = 1; i < array.length; i++)
        {
            int currentIndex = i;
            /*
             * Check:
             *      1. that currentIndex is at least 1
             *      2. that the item directly before the currentIndex is greater than the item at currentIndex
             *
             * If both conditions are met, swap the indexes
             */
            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }
}

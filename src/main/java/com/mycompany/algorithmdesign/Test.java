/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algorithmdesign;

/**
 *
 * @author gurkan
 */
public class Test {

    public static void main(String[] args) {
        // her algoritma için sıralanmamış, ters sıralanmış, random sıralanmış dizi
        // oluşturulacak 50k,100k,250k ve 500 k için boyut - time - algoritma ismi

        Utils utils = new Utils();
        int arrSize = 50000;
        String type = "sorted";
        int array[] = utils.reverseSortedArray(arrSize);
        
        int array2[] = array.clone();
        int array3[] = array.clone();
        int array4[] = array.clone();
        int array5[] = array.clone();
        int array6[] = array.clone();
        long time1;
        long time2;

        // create random array

        // Selection sort array
        SelectionSort selectionSort = new SelectionSort();
        time1 = utils.getNanoTime();
        selectionSort.sort(array);
        time2 = utils.getNanoTime();
        utils.sortingTime(time1, time2, "Selection Sort", array.length, type);
        // System.out.println("Selection Sort Sorted array : \t");
        // utils.print(array);

        // Insertion sort array2
        InsertionSort insertionSort = new InsertionSort();
        time1 = utils.getNanoTime();
        insertionSort.sort(array2);
        time2 = utils.getNanoTime();
        utils.sortingTime(time1, time2, "Insertion Sort", array.length, type);
        // System.out.println("Insertion Sort Sorted array : ");
        // utils.print(array2);

        // Merge sort array3
        MergeSort mergeSort = new MergeSort();
        time1 = utils.getNanoTime();
        mergeSort.sort(array3, 0, array3.length - 1);
        time2 = utils.getNanoTime();
        utils.sortingTime(time1, time2, "Merge Sort", array.length, type);
        // System.out.println("Merge Sort Sorted array : ");
        // utils.print(array3);

        // Heap sort array4
        HeapSort heapSort = new HeapSort();
        time1 = utils.getNanoTime();
        heapSort.sort(array4);
        time2 = utils.getNanoTime();
        utils.sortingTime(time1, time2, "Heap Sort", array.length, type);
        // System.out.println("Heap Sort Sorted array : ");
        // utils.print(array4);

        // Quick sort lomuto sıralanmış dizi verildiğinde stackoverflow hatası verdi
        // array 5
        QuickSortLomuto quickSortLomuto = new QuickSortLomuto();
        time1 = utils.getNanoTime();
        quickSortLomuto.sort(array5);
        time2 = utils.getNanoTime();
        utils.sortingTime(time1, time2, "QuickSort Lomuto", array.length, type);
        // System.out.println("Quick Sort Lomuto Sorted array : ");
        // utils.print(array5);

        // Quick sort hoare array6
        QuickSortHoare quickSortHoare = new QuickSortHoare();
        time1 = utils.getNanoTime();
        quickSortHoare.sort(array6);
        time2 = utils.getNanoTime();
        utils.sortingTime(time1, time2, "QuickSort Hoare", array.length, type);

        // System.out.println("Quick Sort Hoare Sorted array : ");
        // utils.print(array6);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithmdesign;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gurkan
 */
public class Utils {

    void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sortingTime(long time1, long time2, String name, int size, String type) {
        double sortingTime = ((time2 - time1) / 1000000);
        System.out.println( size +" elemanlı "+type+"array için " + name + " algoritmasının çalışma süresi : " + sortingTime + "ms");

        try {
            FileWriter fw = new FileWriter("output.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(type + " ");
            bw.write(size + " ");
            bw.write(name + " ");
            bw.write(String.valueOf(sortingTime));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    long getNanoTime() {
        return System.nanoTime();
    }

    int[] generateArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 999999) + 1;
        }
        return arr;
    }

    int[] sortedArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    int[] reverseSortedArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        return arr;
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithmdesign;

/**
 *
 * @author gurkan
 */
public class QuickSortHoare {
    public void sort(int[] array) {
      sort(array, 0, array.length - 1);
    }
  
    private void sort(int[] array, int low, int high) {
      // Eğer dizinin sol tarafında hiç eleman yoksa metodu durdurun
      if (low >= high) return;
  
      // Dizinin pivot elemanını bulun ve bu değeri bir değişkende tutun
      int pivot = partition(array, low, high);
  
      // Dizinin sol tarafını sıralayın
      sort(array, low, pivot - 1);
  
      // Dizinin sağ tarafını sıralayın
      sort(array, pivot + 1, high);
    }
  
    private int partition(int[] array, int low, int high) {
      // Dizinin pivot elemanını seçin
      // Bu örnekte, pivot elemanı dizinin ortanca elemanıdır
      int pivotIndex = low + (high - low) / 2;
      int pivot = array[pivotIndex];
    
      // Dizinin sol tarafında pivot'a küçük olanların tutulduğu index
      int i = low;
    
      // Dizinin sağ tarafında pivot'tan büyük olanların tutulduğu index
      int j = high;
    
      // Dizinin her elemanını dolaşın
      while (i <= j) {
        // Eğer bir eleman pivot'tan küçükse
        if (array[i] < pivot) {
          // Dizinin sol tarafındaki elemanlarla değiştirin
          i++;
        } else if (array[j] > pivot) {
          // Eğer bir eleman pivot'tan büyükse
          // Dizinin sağ tarafındaki elemanlarla değiştirin
          j--;
        } else {
          // Eğer bir eleman pivot'a eşitse
          // Bu elemanın yeri değişmez
          i++;
          j--;
        }
      }
    
      // Dizinin sol ve sağ tarafındaki elemanları sıraladıktan sonra pivot'u doğru yere taşıyın
      swap(array, i, pivotIndex);
    
      // Pivot'un yeni indexini döndürün
      return i;
    }
  
    private void swap(int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }



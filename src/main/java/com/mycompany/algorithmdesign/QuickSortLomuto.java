
package com.mycompany.algorithmdesign;

/**
 *
 * @author gurkan
 */
class QuickSortLomuto {
    public  void sort(int[] arr) {
      sort(arr, 0, arr.length - 1);
    }
    
    private  void sort(int[] arr, int start, int end) {
      if (start >= end) {
        return;
      }
      
      // pivot elemanı dizinin ortadaki elemanı olarak seçilir
      int pivot = arr[(start + end) / 2];
      
      // pivot elemanından küçük olanlar ve büyük olanlar olarak ikiye bölünür
      int left = start;
      int right = end;
      
      while (left <= right) {
        while (left <= right && arr[left] < pivot) {
          left += 1;
        }
        while (left <= right && arr[right] > pivot) {
          right -= 1;
        }
        if (left <= right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left += 1;
          right -= 1;
        }
      }
      
      // her bölüm ayrı ayrı sıralanır
      sort(arr, start, right);
      sort(arr, left, end);
    }
  }
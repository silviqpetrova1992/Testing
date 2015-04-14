package task2;

import java.util.Scanner;
/**
 * This class is for all array methods
 */
public class Array {
  private int[] array;

  /**
   * This is a constructor with one parameter and initialize the whole array
   *
   * @param n int this is the length of the array
   */
  public Array(int[] n) {
    array = n;

  }

  /**
   * Calculating the smallest element from the array
   *
   * @return minValue int This is the smallest element
   */
  int getMinElement() {
    if(array.length==0){
      return 0;
    }
    int minValue = array[0];
    for (int i = 1; i < array.length; i++)
      if (array[i] < minValue) minValue = array[i];
    return minValue;
  }

  /**
   * Calculating the sum of the elements
   *
   * @return sum int This is the sum of the elements
   */
  int getSum() {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += array[i];
    return sum;
  }

  /**
   * Printing the whole array on the screen
   */
  public int[] print() {
/*    for (int i = 0; i < array.length; i++)
      System.out.println("ar[" + i + "]=" + array[i]);*/
    return array;
  }

  /**
   * Reversing the array
   */
  void reverse() {
    int m;
    for (int i = 0; i < array.length / 2; i++) {
      m = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = m;
    }
  }

  /**
   * Managing which array we have to sort
   */
  public void quickSort() {
    if(array.length==0){
      return;
    }
    sort(0, array.length - 1);
  }

  /**
   * Making quick sort from left element to the right
   *
   * @param left  int this is element from which we are starting the sort
   * @param right int this is element to which we are sorting
   * @return i int This is the element which devide the array to another two arrays, which we have to sort
   */
  private int partition(int left, int right) {
    int i = left, j = right;
    int tmp;
    int pivot = array[(left + right) / 2];
    while (i <= j) {
      while (array[i] < pivot)
        i++;
      while (array[j] > pivot)
        j--;
      if (i <= j) {
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        i++;
        j--;
      }
    }
    return i;
  }
  /**
   * Managing which array we have to sort
   *
   * @param left  int this is element from which we are starting the sort
   * @param right int this is element to which we are sorting
   */
  private void sort(int left, int right) {
    int index = partition(left, right);
    if (left < index - 1)
      sort(left, index - 1);
    if (index < right)
      sort(index, right);
  }
}


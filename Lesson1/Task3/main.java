// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему

package Lesson1.Task3;

public class main {
      public static void main(String[] args) {
            int[] nums = {3, 2, 3, 2 , 1};
            int val = 3;
            int start = 0;
            int end = nums.length - 1;

            while  (start < end ) {
                 if ( nums [start] == val) {
                  int temp = nums [start];
                  nums[start] = nums [end];
                  nums[end] = temp; 
                  end--;
              } else {
                  start++;
              }
          }
  
          // Выводим измененный массив nums
          for (int i = 0; i < nums.length; i++) {
              System.out.print(nums[i] + " ");
          }
      }
  }
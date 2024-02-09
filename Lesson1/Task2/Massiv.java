// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package Lesson1.Task2;

public class Massiv {
      public static void main(String[] args) {
            int [] array = {1,1,0,1,1,1};
            int maxCount = getMaxOnes(array);
            System.out.println(maxCount);
      }
            private static int getMaxOnes(int[] array) {
                  int count = 0;
                  int maxCount = 0;
                  for (int j : array) {
                        if (j == 1) count++;
                        else {
                        count = 0;
                        }
                        if (maxCount < count) {
                        maxCount = count;
                        }
                        }
                  return maxCount;
            } 
                  
            }
      

            // for (int i = 0; i < array.length; i++) {
            //       if (array[i] ==1){
            //             count ++;
                  
            //             // // if (count > maxCount){
            //             // // maxCount = count;
            //             // }
            //             maxCount = count > maxCount ? count : maxCount; // второй варинт  . сверху первый вариант закомичен
            //       }
            //       else {
            //             count = 0;
            //       }
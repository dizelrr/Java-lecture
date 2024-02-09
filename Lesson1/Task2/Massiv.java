// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package Lesson1.Task2;

public class Massiv {
      public static void main(String[] args) {
            int [] array = {1,1,0,1,1,1};
            int count = 0;
            int maxCount = 0;
            for (int i = 0; i < array.length; i++) {
                  if (array[i] ==1){
                        count ++;
                  
                        if (count > maxCount){
                        maxCount = count;
                        }
                  }
                  else {
                        count = 0;
                  }
                  
            } 
            System.out.println(maxCount);
      }
}

// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() класса Collections и вывести его на
// экран.

package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sort {
      public static void main(String[] args) {
            List<Integer> list = getList(10, 10);
            System.out.println(list);
            Collections.sort(list); // сортировка
            System.out.println(list);
      }

      private static List<Integer> getList(int size, int max) { // метод заполняет случайными числами
            List<Integer> list = new ArrayList<>();
            Random rnd = new Random();
            for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(max));
            }
            return list;
      }

}


// Создать список типа ArrayList<String>.
// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа.

package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DeleteNumbers {
      public static List<String> createList() {
            List<String> list = new ArrayList<>(Arrays.asList("a", "1", "c", "d", "12", "Hello", "54"));
            return list;
            }

      public static void deletedNumberWithFor(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                  if (isNumber(list.get(i))) {
                  list.remove(i);
                  i--;
}
}
}

      public static boolean isNumber (String str) {
            try {
            Integer.parseInt(str);
            return true;
            } catch (Exception e) {
            return false;
}
}

      public static void deletedNumberWithIterator(List<String> list) {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
            String nextItem = iterator.next();
            if (isNumber(nextItem)) {
            iterator.remove();
}
}
}
}

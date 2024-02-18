//📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

package Lesson2;

public class CompressString {
      public static void main(String[] args) {
            String str = "aaaabbbcdd";
            System.out.println(CompressString(str));
            }
            
            public static String CompressString(String str) {
            StringBuilder sb = new StringBuilder();
            
            char currentSymbol = str.charAt(0);
            int count = 1;
            
            for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentSymbol) {
            count++;
            } else {
            sb.append(currentSymbol).append(count);
            count = 1;
            currentSymbol = str.charAt(i);
            }
            }
            sb.append(currentSymbol).append(count);
            
            return sb.toString();
            }
}

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

package Lesson2;

import java.io.FileWriter;

public class RepeatWord {
      public static void main(String[] args) {
            int count = 100;
            String word = "TEST";
            String words = repeatWord(count, word);
            // System.out.println(words);
            writeToFile(words, "Text.txt");

}

public static String repeatWord(int count, String word) {
      StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
            sb.append(word + " ");
            }
            return sb.toString();
            }

public static void writeToFile(String text, String fileName) {   // метод запись файла в файл
      try (FileWriter fileWriter = new FileWriter(fileName)) {
      fileWriter.write(text);
      System.out.println("Данные успешно записаны в файл");
      } catch (Exception e) {
      System.out.println("Ошибка записи файла");
}
}
}
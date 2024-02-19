// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Planets {
      public static void main(String[] args) {
            List<String> planets = getPlanets();
            printCountPlanets(planets);
}

      private static List<String> getPlanets() {
            List<String> planets = new ArrayList<>();
            planets.add("Меркурий");
            planets.add("Венера");
            planets.add("Марс");
            planets.add("Земля");
            planets.add("Юпитер");
            planets.add("Меркурий");
            planets.add("Сатурн");
            planets.add("Уран");
            planets.add("Нептун");
            planets.add("Земля");
            planets.add("Сатурн");
            planets.add("Венера");
            return planets;
}

      public static void printCountPlanets(List<String> planets) {
            List<String> sortedPlanets = new ArrayList<>(planets);
            Collections.sort(sortedPlanets);
            String prevPlanet = "";
            int count = 0;
            for (String planet : sortedPlanets) {
                  if (!planet.equals(prevPlanet) && count > 0) {
                  System.out.println(prevPlanet + " > " + count);
                  count = 1;
} 
                  else {
                  count ++;
}
            prevPlanet = planet;
}
}
}

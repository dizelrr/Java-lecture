package Lesson1.Task1;

import java.util.Scanner;

public class Name {
      public static void main(String[] args) {
            Scanner scanner  = new Scanner(System.in, "ibm866");
            System.out.println("Ввидите ваше имя: ");
            String name = scanner.nextLine();
            scanner.close();
            System.out.println("Привет "+ name );
      }
}

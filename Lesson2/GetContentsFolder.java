package Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GetContentsFolder {
      private static Logger logger = Logger.getLogger(GetContentsFolder.class.getName());

public static void main(String[] args) {
      initLogger();
      logger.info("Start program");
      String[] contentFolder = getContentsFolder(".");
      writeToFile(contentFolder, ".");
}

public static String[] getContentsFolder(String folder) {
      logger.info("getContentsFolder");
      File file = new File(folder);
      return file.list();
}

public static void writeToFile(String[] arrayString, String fileName) {

      try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (String str : arrayString) {
                  fileWriter.write(str);
                   fileWriter.write(System.lineSeparator());
}
logger.info("Успешною");

} catch (Exception e) {
logger.log(Level.WARNING, "Ошибка записи файла");
}
}

public static void initLogger() {
      try {
            FileHandler fileHandler = new FileHandler("log.txt",true);
            logger.addHandler(fileHandler);
            SimpleFormatter formetter = new SimpleFormatter();
            fileHandler.setFormatter(formetter);
      } catch (Exception e) {
      e.printStackTrace();
}
}
      
}

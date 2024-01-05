package org.example;

import org.example.Controller.Controller;
import org.example.Service.CreateComplexNumbers;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class App {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(CreateComplexNumbers.class.getName());
        FileHandler fh = new FileHandler("c:\\Users\\Admin\\OneDrive\\Документы\\Учёба\\Programming" +
                "\\OOP_HW7\\log.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        Controller controller = new Controller();
        controller.start();
    }

}
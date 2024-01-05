package org.example.Service;

import org.example.Data.ComplexNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class CreateComplexNumbers implements ICreateNumbers{
    Logger logger = Logger.getLogger(CreateComplexNumbers.class.getName());

    private List<ComplexNumbers> complexNumbers;

    public CreateComplexNumbers() {
        this.complexNumbers = new ArrayList<>();
    }

    @Override
    public List<ComplexNumbers> getAllComplexNumbers() {
        return complexNumbers;
    }


    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа");
        x = scanner.nextDouble();
        logger.info(" User entered the real part of the first number ");
        System.out.println("Введите мнимую часть первого числа");
        y = scanner.nextDouble();
        logger.info(" User entered the imaginary part of the first number ");
        ComplexNumbers complexNumber1 = new ComplexNumbers(x, y);
        complexNumbers.add(complexNumber1);
        logger.info(" Save the first number ");
        System.out.println("Введите действительную часть второго числа");
        x = scanner.nextDouble();
        logger.info(" User entered the real part of the second number ");
        System.out.println("Введите мнимую часть второго числа");
        y = scanner.nextDouble();
        logger.info(" User entered the imaginary part of the second number ");
        ComplexNumbers complexNumber2 = new ComplexNumbers(x, y);
        complexNumbers.add(complexNumber2);
        logger.info(" Save the second number ");
    }
}

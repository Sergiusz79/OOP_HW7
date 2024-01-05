package org.example.Service;

import org.example.Data.ComplexNumbers;

interface ICalculator {

    ComplexNumbers addition(ComplexNumbers x, ComplexNumbers y);

    ComplexNumbers subtraction(ComplexNumbers x, ComplexNumbers y);

    ComplexNumbers multiplication(ComplexNumbers x, ComplexNumbers y);

    ComplexNumbers division(ComplexNumbers x, ComplexNumbers y);
}

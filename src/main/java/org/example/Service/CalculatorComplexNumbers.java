package org.example.Service;

import org.example.Data.ComplexNumbers;


public class CalculatorComplexNumbers implements ICalculator {

    @Override
    public ComplexNumbers addition(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator(x.getNumerator() + y.getNumerator());
        z.setImaginaryPart(x.getImaginaryPart() + y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumbers subtraction(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator(x.getNumerator() - y.getNumerator());
        z.setImaginaryPart(x.getImaginaryPart() - y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumbers multiplication(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator((x.getNumerator() * y.getNumerator()) -
                (x.getImaginaryPart() * y.getImaginaryPart()));
        z.setImaginaryPart((x.getImaginaryPart() * y.getNumerator()) +
                (x.getNumerator() * y.getImaginaryPart()));
        return z;
    }

    @Override
    public ComplexNumbers division(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator(((x.getNumerator() * y.getNumerator()) +
                (x.getImaginaryPart() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart() * y.getImaginaryPart())));
        z.setImaginaryPart((((x.getImaginaryPart() * y.getNumerator()) -
                (x.getNumerator() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart() * y.getImaginaryPart()))));
        return z;
    }


}

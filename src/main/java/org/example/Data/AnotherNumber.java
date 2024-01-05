package org.example.Data;

public class AnotherNumber extends ComplexNumbers{

    public AnotherNumber(double real, double im) {
        super(real, im);
    }

    @Override
    public String toString() {
        return "AnotherNumber{"+ getNumerator() + "}+{" + getImaginaryPart() + "}";
    }
}

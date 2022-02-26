package by.sheshko.homework.test;

import by.sheshko.homework.task02.MathCalculator;

public class JarTestingClass {
    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator();

        calculator.calculateExpression("(2*3)+(10/2)-1");
    }
}

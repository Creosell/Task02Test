package by.sheshko.homework.test;

import by.sheshko.homework.task02.MathCalculator;

/**
 * Класс JarTestingClass предназначен для проверки работоспособности
 * подклчюенной библиотеки Task02.jar.
 */
public class JarTestingClass {
    public static void main(final String[] args) {
        MathCalculator calculator = new MathCalculator();

        System.out.println(calculator.calculateExpression("(2*3)+(10/2)-1"));
    }
}

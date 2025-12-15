package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumOfAllOperation(int d) {
        int resultSum = sum(d);
        int resultMultiply = multiply(d);
        int resultMinus = minus(d);
        int resultDivide = divide(d);
        return resultSum + resultMultiply + resultMinus + resultDivide;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(10));
        System.out.println(calculator.multiply(10));
        System.out.println(minus(10));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumOfAllOperation(10));
    }
}

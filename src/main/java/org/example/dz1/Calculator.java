package org.example.dz1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    } // alt + insert

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return dividend / divisor;
    }

    public double calculateDiscount(double summa, int procent){
        return  summa*procent/100;
    }
}

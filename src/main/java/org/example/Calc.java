package org.example;

public class Calc {
    public int  summ (int a, int b) {
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равно " + result);
        System.out.println();
        System.out.printf("Сумма %d и %d равна %d", a, b, result);
        return result;
    }
    public int sub (int a, int b) {
        int result;
        result = a - b;
        System.out.println("Разность " + a + " и " + b + " равно " + result);
        System.out.println();
        System.out.printf("Разность %d и %d равна %d", a, b, result);
        return result;
    }
}

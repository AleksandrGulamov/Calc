package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println(("before all"));
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println(("before each"));
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 7);
        Assertions.assertEquals(8, result, "Не тот результат");
    }

    @RepeatedTest(5)
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 5);
        Assertions.assertEquals(6, result, "Не тот результат");
    }

    @Test
    @DisplayName("Проверка вычитания 1")
    @Timeout(10)
    @Tag("sub")
    void sub1() {
        Calc calc = new Calc();
        int result = calc.sub(10, 3);
        Assertions.assertEquals(7, result, "Не тот результат");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1,2,3", "-1,2,1", "0,0,0"})
    @DisplayName("Проверка суммирования (параметризированная) 1")
    @Tag("Param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот результат");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"3,2,1", "-1,2,-3", "0,0,0"})
    @DisplayName("Проверка вычитания (параметризированная) 1")
    @Tag("Param")
    void sub3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sub(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот результат");
    }


}
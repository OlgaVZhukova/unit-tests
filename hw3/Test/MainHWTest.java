package hw3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    //HW3.Task1
    @Test
    void evenOddNumber() {
        assertTrue(MainHW.evenOddNumber(2)); // проверка того, что метод корректно определяет четное число
        assertTrue(MainHW.evenOddNumber(0)); // проверка того, что метод корректно определяет 0 как четное число
        assertTrue(MainHW.evenOddNumber(-2)); // проверка того, что метод корректно определяет отрицательное число как четное
        assertFalse(MainHW.evenOddNumber(1)); // проверка того, что метод корректно определяет нечетное число
    }

    //HW3.Task2
    @Test
    void numberInInterval() {
        assertTrue(MainHW.numberInInterval(26)); // проверка того, что число из интервала определяется корректно
        assertFalse(MainHW.numberInInterval(12)); // проверка того, что число меньше 25 корректно определяется числом вне интервала
        assertFalse(MainHW.numberInInterval(150)); // проверка того, что число больше 100 корректно определяется числом вне интервала
        assertFalse(MainHW.numberInInterval(25)); // проверка того, что метод корректно ведет себя на границах
        assertFalse(MainHW.numberInInterval(100)); // проверка того, что метод корректно ведет себя на границах
    }
}